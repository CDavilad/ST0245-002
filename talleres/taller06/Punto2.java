
package Taller6;
import java.util.ArrayList;
import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner scan = new Scanner(System.in);
        boolean condicion = true;
        while(condicion){
            System.out.println("Ingrese número (-1 para detener)");
            int aux = scan.nextInt();
            if(aux == -1){
                condicion = false;
            }else{
                numeros.add(aux);
            }   
        }
        ArrayList<Integer> numeros2 = new ArrayList();
        for (int i = numeros.size()-1; i >= 0; i--) {
            numeros2.add(numeros.get(i));
        }
        for(int x = 0; x < numeros2.size(); x++){
            System.out.println(numeros2.get(x));
        }
    }
}