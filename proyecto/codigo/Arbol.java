import java.util.*;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
public class Arbol {
    public static void main(String args[]) {
        float falPos = 0;
        float falNeg = 0;
        float verPos = 0;
        float verNeg = 0;
        long t1 = System.currentTimeMillis();
        LinkedList<Integer[]> list1 = new LinkedList<>();
        ArrayList<String[]> arr1 = Lector.main("4_train_balanced_135000.csv");
        double[] temp = MejorPregunta.mejor1(arr1, 66, 73, list1);
        Nodo raiz = new Nodo(arr1,temp);
        arbol(raiz,list1);
        int i = 0;
        long t2 = System.currentTimeMillis();
        long tf = t2 - t1;
        System.gc();
        System.out.println("Tiempo de ejecucion: " + tf + " milisegundos");
        System.gc();
        System.out.println("Uso de memoria: " + (double) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024)/1024 + " MB");
        String[][] res = new String[arr1.size()][2];
        double sal = 0;
        double nSal = 0;
        double total = 0;
        for(int j = 1; i<arr1.size(); i++){
            res[j][0] = arr1.get(j)[arr1.get(0).length];
            String aux2 = arr1.get(i)[arr1.get(i).length - 1];
            if(Integer.parseInt(aux2) == 1){
                sal++;
                res[j][1] = "1";
            }else{
                nSal++;
                res[j][1] = "0";
            }
            if(res[j][0].equals(res[j][1])){
                if(res[j][0].equals("1")){
                    verPos++;
                }else{
                    falNeg++;
                }
            }else{
                if(res[j][0].equals("0")){
                    falPos++;
                }else{
                    verNeg++;
                }
            }
        }
        total = verPos+verNeg+falPos+falNeg;
        System.out.println("Exactitud: "+( (verPos+verNeg) / (total))*100);
        System.out.println("Sensibilidad: "+(verPos/(verPos+falNeg))*100);
        System.out.println("Precision: "+(verPos/(verPos+falNeg))*100+"%");
    }

    public static void arbol(Nodo nodo, LinkedList<Integer[]> list1) {
        if(nodo.preguntas[2]==0 || nodo.preguntas[2]==100){
            return;
        }
        ArrayList<String[]> derecha = new ArrayList<>();
        ArrayList<String[]> izquierda = new ArrayList<>();
        for (int i=1;i<nodo.datos.size();i++) {
            String[] est=nodo.datos.get(i);
            if (Float.parseFloat(est[(int) nodo.preguntas[0]]) >= nodo.preguntas[1]){
                derecha.add(est);
            }
            else{
                izquierda.add(est);
            }
        }
        nodo.der=new Nodo(derecha, MejorPregunta.mejor1(derecha,66, 73, list1) );
        nodo.izq=new Nodo(izquierda, MejorPregunta.mejor1(izquierda,66, 73, list1) );
        arbol(nodo.der, list1);
        arbol(nodo.izq, list1);
    }
}
