import java.util.LinkedList;
public class BrKey{
    public static String brokenKb(String s1){
        LinkedList<String> lista = new LinkedList<>();
        boolean enF = true;
        int c = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == '['){
                if (enF) {
                    lista.addLast(s1.substring(c,i));
                } else {
                    lista.addFirst(s1.substring(c,i));
                }
                c = i + 1;
                enF = false;
            }
            if(s1.charAt(i) == ']'){
                if (enF) {
                    lista.addLast(s1.substring(c,i));
                } else {
                    lista.addFirst(s1.substring(c,i));
                }
                c = i + 1;
                enF = true;
            }
        }
        if(enF){
            lista.addLast(s1.substring(c));
        }else{
            lista.addFirst(s1.substring(c));
        }
        String res= "";
        for(String s: lista){
            res = res + s;
        }
        return res;
    }
}
