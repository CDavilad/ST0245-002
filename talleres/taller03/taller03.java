
public class Taller03
{
    public static void main(String[] args){
        hanoi(5);
        permutation("abcd");
    }
    
    public static void hanoi(int  disc){
        hanoi(disc, "Tower1", "Tower2", "Tower3");
    }

    public static void hanoi(int disc, String a, String b, String c){
        if (disc == 1)
            System.out.println (a + " -> " + c);
        else {
            hanoi(disc - 1 ,a , c ,b);
            hanoi(1 , a , b , c);
            hanoi(disc - 1 ,b , a ,c);
        }
    }

    public static void permutation(String str){
        permutationAux("", str);
    }

    public static void permutationAux(String prefix, String str){
        if(str.length() == 0){
            System.out.println(prefix);
        }else{
            for(int i = 0; i < str.length(); i++){
                permutationAux(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1, str.length()));
            }
        }
    }
}
