
public class Password
{
    public static void main(String[] args){
        permutation("abcde");
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
