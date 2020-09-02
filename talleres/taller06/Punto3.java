
package Taller6;
import java.util.Scanner;
import java.util.ArrayList;

public class Punto3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        System.out.println("");
        int num = scan.nextInt();
            if(num <= 0){
                System.out.println("Algo no me cuadra");
            }else{
                for(int i = 0; i < num; i++){
                    for(int j = 0; j <= i; j++){
                        numeros.add(j+1);
                    }
                }
            }
        for(int x = 0; x < numeros.size(); x++){
            System.out.println(numeros.get(x));
        }
    }
}
