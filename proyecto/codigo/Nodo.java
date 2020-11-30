import java.util.ArrayList;
public class Nodo {
    double[] preguntas;
    Nodo der; 
    Nodo izq; 
    ArrayList<String[]> datos;
    public Nodo(ArrayList<String[]> datos,double[] preguntas) {
        this.datos = datos;
        this.preguntas = preguntas;
    }
}
