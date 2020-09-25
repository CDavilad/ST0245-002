import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
public class Taller08
{
    public static int polacaInversa(String s){
        Stack<Integer> pila = new Stack();
        for(String c: s.split(" ")){
            if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")){
                int num1 = pila.pop();
                int num2 = pila.pop();
                int aux = 0;
                switch(c){
                    case "+":
                    aux = num2+num1;
                    break;
                    
                    case "-":
                    aux = num2-num1;
                    break;
                    
                    case "*":
                    aux = num2*num1;
                    break;
                    
                    case "/":
                    aux = num2/num1;
                    break;
                }
                pila.push(aux);
            }else{
                pila.push(Integer.parseInt(c));
            }
        }
        return pila.pop();
    }
    
    public static void ejercicio2(Stack<Nevera> neveras, Queue<Solicitud> solicitudes){
        LinkedList<String> res = new LinkedList();
        for(Solicitud s: solicitudes){
            String aux = "("+s.getEmpresa();
            int tem = s.getNSoli();
            while(tem > 0 && neveras.size() != 0){
                Nevera aux1 = neveras.pop();
                aux = aux + "(" + aux1.getCodigo() +"," + aux1.getMarca() + ")";
                tem--;
            }
            aux = aux + ")";
            res.add(aux);
        }
        
        for(String c : res){
            System.out.println(c);
        }
    }
    
    public static void main(String[] args){
        Stack<Nevera> neveras = new Stack();
        Nevera n1 = new Nevera(1, "haceb");
        Nevera n2 = new Nevera(2, "lg");
        Nevera n3 = new Nevera(3, "ibm");
        Nevera n4 = new Nevera(4, "haceb");
        Nevera n5 = new Nevera(5, "lg");
        Nevera n6 = new Nevera(6, "ibm");
        Nevera n7 = new Nevera(7, "haceb");
        Nevera n8 = new Nevera(8, "lg");
        Nevera n9 = new Nevera(9, "ibm");
        neveras.push(n1);
        neveras.push(n2);
        neveras.push(n3);
        neveras.push(n4);
        neveras.push(n5);
        neveras.push(n6);
        neveras.push(n7);
        neveras.push(n8);
        neveras.push(n9);
        neveras.push(n8);
        neveras.push(n9);
        
        Queue<Solicitud> solicitudes = new LinkedList<Solicitud>();
        
    
        Solicitud s1 = new Solicitud("eafit", 10);
        Solicitud s2 = new Solicitud("la14", 2);
        Solicitud s3 = new Solicitud("olimpica", 4);
        Solicitud s4 = new Solicitud("exito", 1);
        solicitudes.add(s4);
        solicitudes.add(s3);
        solicitudes.add(s2);
        solicitudes.add(s1);
        
       
        Taller08.ejercicio2(neveras,solicitudes);
    }
}
