import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class Organizar
{
    public static void ordenamiento(Stack<Nevera> neveras, Queue<Solicitud> solicitudes){
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
