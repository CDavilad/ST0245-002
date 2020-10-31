import java.util.ArrayList;
public class Punto2{
    public static Nodo nodo;
    public class Nodo{
        public Nodo izq;
        public Nodo der;
        public int dato;
        
        public Nodo(int d){
            this.dato = d;
        }
    }
    
    public  void arbol(int[] arb){
        nodo = new Nodo(arb[0]);
        for(int i = 1; i < arb.length; i++){
            ramificar(nodo, arb[i]);
        }
    }
    
    public Nodo ramificar(Nodo nodos, int d){
        if(nodos == null){
            return new Nodo(d);
        }else if(d < nodos.dato){
            nodos.izq = ramificar(nodos.izq, d);
        }else if(d > nodos.dato){
            nodos.der = ramificar(nodos.der, d);
        }
        return nodos;
    }
    
    public static void posWenas(Nodo n){
        if(n != null){
            posWenas(n.izq);
            posWenas(n.der);
            System.out.println(n.dato);
        }
    }
    
    public static void main(String[] args){
        int[] t = {50, 30, 24, 5, 28, 45, 98, 52, 60};
        Punto2 p = new Punto2();
        p.arbol(t);
        posWenas(nodo);
    }
}
