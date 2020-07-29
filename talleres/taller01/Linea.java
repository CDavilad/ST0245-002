
package Estructuras;

public class Linea
{
    private final Punto pI;
    private final Punto p2;
    private final Punto p3;
    private final Punto pF;
    private final double pendiente;
   
    public Linea(double x1, double y1, double x2, double y2){
        this.pI = new Punto(x1, y1);
        this.pF = new Punto(x2, y2);
        this.pendiente = (pF.y()-pI.y())/(pF.x()-pI.x());
        double distancia = (this.pF.x()-this.pI.x())/3;
        this.p2 = new Punto(pI.x()+distancia, (this.pI.x()+distancia)*this.pendiente);
        this.p3 = new Punto(pI.x()+distancia*2, (this.pI.x()+distancia*2)*this.pendiente);
    }
   
    public String toString(){
        String toString = "("+ this.pI.x() + ","+this.pI.y()+")("+this.p2.x()+","+this.p2.y()+")("+this.p3.x()+","+this.p3.y()+")("+this.pF.x()+","+this.pF.y()+")";
        return toString;
    }
}
