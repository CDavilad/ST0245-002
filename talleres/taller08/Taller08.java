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
    
    
}
