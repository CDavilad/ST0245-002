
package Taller9;

import java.util.HashMap;
import java.util.Scanner;

public class Punto2 {
    static HashMap directorio = new HashMap();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean condicion = true;
        
        while(condicion){
            int opcion;
            System.out.println("\n########################################\n");
            System.out.println("Escoja una opcion:\n\t1. agregar a la HashTable\n"
                               + "\t2. Buscar en la HashTable por llave\n"
                               + "\t3. Buscar en la Hashtable por valor\n"
                               + "\t4. Finalizar\n");
            System.out.println("########################################\n");
            System.out.print("Ingrese una opcion: "); 
            opcion = scan.nextInt();
            
            switch(opcion){
                case 1: agregar();
                        break;
                        
                case 2: buscar();
                        break;
                        
                case 3: buscar2();
                        break;
                        
                case 4: condicion = false; 
                        break;
                        
                default: System.out.println("Creo que no me estás entendiendo"); 
                        break;
            }
        }
    }
    
    public static void agregar(){
        System.out.println("Ingrese el nombre de la empresa: ");
        String empresa = scan.next();
        System.out.println("Ingrese el pais: ");
        String pais = scan.next();
        
        Relacion relacion = new Relacion(empresa, pais);
        directorio.put(relacion.empresa, relacion.pais);
    }
    
    public static void buscar(){
        System.out.println("Cual es la empresa a buscar?");
        String empresa = scan.next();
        
        if(directorio.containsKey(empresa)){
            System.out.println(directorio.get(empresa));
        }else{
            System.out.println("No está");
        }
    }
    
    public static void buscar2(){
        System.out.println("Cual es el pais a buscar?");
        String pais = scan.next();
        
        if(directorio.containsValue(pais)){
            System.out.println(directorio.keySet());
        }else{
            System.out.println("nostá");
        }
    }
}