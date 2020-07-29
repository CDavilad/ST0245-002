
package Estructuras;

public class Contador {
    private int cuenta;
    private final String id;

    public Contador(String id) {
        this.cuenta = 0;
        this.id = id;
    }
    
    public void incrementar(int valor){
        this.cuenta+= valor;
    }  
    
    public void decrementar(int valor){
        this.cuenta-= valor;
    }
    
    public int incrementos(){
        return this.cuenta;
    }
    
    public String toString(){
        return this.id + "\n" + this.cuenta;
    }
}
