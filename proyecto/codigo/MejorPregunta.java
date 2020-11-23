import java.util.ArrayList;
import java.util.LinkedList;
public class MejorPregunta{
    public static double[] preguntaM(ArrayList<String[]> arr,int pr, int ul,LinkedList<Integer[]> lista) {
        double[] preguntaMe = {0,0,100};
        for(int i= pr;i<ul;i++) {
            double[] aux=preguntaMe(arr, i, 0, 100);
            if(preguntaMe[2]>aux[1] && comparar(i,aux[0],lista)) {
                preguntaMe[0]=i;
                preguntaMe[1]=aux[0];
                preguntaMe[2]=aux[1];
            }
        }
        Integer[] s={(int) preguntaMe[0],(int) preguntaMe[1]};
        lista.add(s);
        return preguntaMe;
    }

    private static boolean comparar(int aux1,double aux2, LinkedList<Integer[]> lista) {
        for(Integer[] n:lista) {
            if(n[0]==aux2 && n[1]==aux2){
                return false;
            }
        }
        return true;
    }

    public static double[] preguntaMe(ArrayList<String[]> arr, int aux1, int aux2, int ul) {
        int preguntaM = aux2;
        for (int i = 1; i < ul - aux2; i++) {
            double f = obtGini(arr, aux1, aux2+i);
            double l = obtGini(arr, aux1, preguntaM);
            preguntaM = f < l ? aux2 + i : preguntaM;
        }
        double[] rgt= {preguntaM, obtGini(arr, aux1, preguntaM)};
        return rgt;
    }
    
    public static double obtGini(ArrayList<String[]> arr, int aux, int dif) {
        float es = 0, nd0 = 0, nlf = 0, nlf2 = 0;
        for (int i = 1; i < arr.size(); i++) {
            String otra = arr.get(i)[aux-1];
            String aux1 = Float.parseFloat(otra) >= dif ? "1" : "0";
            String aux2 = arr.get(i)[arr.get(i).length - 1];
            if (aux1.equals("1")) {
                if (aux1.equals(aux2))
                    es++;
                else
                    nd0++;
            } else {
                if (aux1.equals(aux2))
                    nlf++;
                else
                    nlf2++;
            }
        }
        ImpGini g = new ImpGini();
        return g.giniPond(es, nd0, nlf, nlf2);
    }
}