
package Taller10;


public class Solucion{

    private Nodo root;
     
    public Solucion() {
        this.root = null;
    }
    
    public Solucion(int n) {
        this.root = new Nodo(n);
    }

    //Llama al metodo auxiliar insertar
    public void insertar(int n) {
        insertarAux(root, n);
    }
    // Agrega un nodo al arbol
    private void insertarAux(Nodo nodo, int n) {
        if(nodo == null){
            Nodo arbol = new Nodo(n);
            nodo = arbol;
        }
        if (nodo.data == n){
            return;
        }else if (n > nodo.data) {
            if (nodo.rigth == null){
                nodo.rigth = new Nodo(n);
            }else {
                insertarAux(nodo.rigth, n);
            }
        }else {
            if (nodo.left == null) {
                nodo.left = new Nodo(n);
            }else {
                insertarAux(nodo.left, n);
            }
        }
    }
  
    public boolean buscar(int n) {
        return buscarAux(root, n);
    }
    
    private boolean buscarAux(Nodo nodo, int n) {
        if (null == nodo) {
            return false;
        }
        if (nodo.data == n) {
            return true;
        }
        if (n > nodo.data) {
            return buscarAux(nodo.rigth, n);
        }else if(n < nodo.data){
            return buscarAux(nodo.left, n);
        }else{
            return false;
        }
    }

    public void borrar(int n){
        borrarAux(root, n);
    }
    
    private Nodo borrarAux(Nodo nodo, int n) {
        if (nodo == null) {
            return null;
        }
        if (nodo.data == n) {
            if (nodo.left == null && nodo.rigth == null) {
                return null;
            }
            if (nodo.rigth == null) {
                return nodo.left;
            }
            if (nodo.left == null) {
                return nodo.rigth;
            }else {
                nodo.data = encontrarNodoReemplazo(nodo.left);
            }
        }
        if (n > nodo.data) {
            nodo.rigth = borrarAux(nodo.rigth, n);
            return nodo;
        }
        nodo.left = borrarAux(nodo.left, n);
        return nodo;
    }

    private int encontrarNodoReemplazo(Nodo n) {
        if (n.rigth == null) {
            int res = n.data;
            n = null;
            return res;
        }
        return encontrarNodoReemplazo(n.rigth);
    }
    
    public void mostrarArbol(){
        mostrarAux(root);
    }
    
    private void mostrarAux(Nodo arbol){
        int cont = 0;
        if(arbol==null){
            System.out.println("arbol vacio");
        }else if(arbol.rigth != null){
            for(int x = 0; x < cont; cont++){
                System.out.println("   ");
            }
            System.out.println(arbol.data);
            mostrarAux(arbol.left);
        }else{
            mostrarAux(arbol.left);
        }
    }
    
    public static void main(String[] args) {
        Solucion solucion = new Solucion();
        
        System.out.println("va 1");
        
        solucion.insertar(1);
        solucion.insertar(2);
        solucion.insertar(3);
        solucion.insertar(4);
        solucion.insertar(5);
        
        System.out.println("va 2");
        
        solucion.mostrarArbol();
        
    }
}
