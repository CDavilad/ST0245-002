
package Estructuras;

public class Punto {
    private double x,y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double x(){
        return this.x;
    }
    
    public double y(){
        return this.y;
    }
    
    public double radioPolar(){
        double distancia = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return distancia;
    }
    
    public double anguloPolar(){
        double angulo = Math.atan(this.y/this.x);
        return angulo;
    }
    
    public double distanciaEuclidiana(Punto otro){
        double distancia = Math.sqrt((Math.pow(otro.x()-this.x, 2) + (Math.pow(otro.y()-this.y, 2))));
        return distancia;
    }
}