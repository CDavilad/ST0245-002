
package Taller9;

import java.util.HashMap;
import java.util.Scanner;

public class Punto1 {
    static HashMap directorio = new HashMap();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean condicion = true;
        
        while(condicion){
            int opcion;
            System.out.println("\n########################################\n");
            System.out.println("Escoja una opcion:\n\t1. agregar a la HashTable\n"
                               + "\t2. Buscar en la HashTable\n\t3. Finalizar\n");
            System.out.println("########################################\n");
            System.out.print("Ingrese una opcion: "); 
            opcion = scan.nextInt();
            
            switch(opcion){
                case 1: agregar();
                        break;
                        
                case 2: System.out.println(buscar());
                        break;
                        
                case 3: condicion = false; 
                        break;
                        
                default: System.out.println("Creo que no me estás entendiendo"); 
                        break;
            }
        }
    }
    
    public static void agregar(){
        System.out.println("Ingese el nombre: ");
        String nombre = scan.next();
        System.out.println("Ingerse el numero: ");
        Long numero = scan.nextLong();
        
        Pareja pareja = new Pareja(nombre, numero);
        directorio.put(pareja.nombre, pareja.numero);
    }
    
    public static boolean buscar(){
        System.out.println("Cual es el nombre a buscar?");
        String nombre = scan.next();
        return (directorio.containsKey(nombre));
    }
}