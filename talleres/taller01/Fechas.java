
package Estructuras;

public class Fechas {
    private final int dia;
    private final int mes;
    private final int anyo;

    public Fechas(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int Dia() {
        return dia;
    }

    public int Mes() {
        return mes;
    }

    public int Anyo() {
        return anyo;
    }
    
    public int comparar(Fechas otra){
        int num = -2;
        if(this.anyo > otra.Anyo()){
            num = 1;
        }else if(this.anyo < otra.Anyo()){
            num = -1;
        }else if(this.anyo == otra.Anyo()){
            if(this.mes > otra.Mes()){
                num = 1;
            }else if(this.mes < otra.Mes()){
                num = -1;
            }else if(this.mes == otra.Mes()){
                if(this.dia > otra.Dia()){
                    num = 1;
                }else if(this.dia < otra.Dia()){
                    num = -1;
                }else{
                    num = 0;
                }
            }
        }
        return num;
    }
    
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.anyo;
    }
}
