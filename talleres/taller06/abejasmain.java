
package Taller6;
import java.util.ArrayList;
import java.util.Scanner;
public class abejasmain {
    public static void main(String[] args) {
        Abejas lector = new Abejas();
        System.out.println("Ingrese el camino del archivo");
        Scanner scan = new Scanner(System.in);
        String camino = scan.nextLine();
        ArrayList hola = lector.leerCSV(camino);
    
        System.out.println("¿Desea agregar o eliminar abejas? (Si/No)");
        String respuesta = scan.nextLine();
        if(respuesta.equalsIgnoreCase("si")){
            System.out.println("¿Qué desea hacer? (Agregar/Eliminar)");
            String respuesta2 = scan.nextLine();
            if (respuesta2.equalsIgnoreCase("agregar")){
                System.out.println("¿ingrese lo que va a agregar? y ¿En cuál index?");
                String agregar = scan.nextLine();
                int index = scan.nextInt();
                hola.add(index, agregar);
            }else if(respuesta2.equalsIgnoreCase("eliminar")){
                System.out.println("¿En cuál index?");
                int index = scan.nextInt();
                String agregar = scan.nextLine();
                hola.remove(index);
            }
        }else if(respuesta.equalsIgnoreCase("no")){
            System.out.println("Todo listo");
        }else{
            System.out.println("Algo no me cuadra...");
        }
    } 
}
