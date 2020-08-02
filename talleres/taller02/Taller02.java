
package Taller2;

public class Taller02 {
    public static int gcd(int q, int p) {
        if(p==0){
            return q;
        }else{
            return gcd(p, q % p);
        }
    }
    
    public static boolean SumaGrupo(int[] nums, int target){
         return SumaGrupoBasico(0,nums,target);
    }
    
    private static boolean SumaGrupoBasico(int index, int[]nums, int target){
        System.out.println(index + " " + target);
        if(index >= nums.length){
            return target == 0;
        }else{
            boolean prueba1 = SumaGrupoBasico(index+1, nums, target-nums[index]);
            if(prueba1){
                return true;
            }else{
                boolean prueba2 = SumaGrupoBasico(index+1, nums, target);
                return prueba2;
            }
        }
    }
    
    public static void combinations(String s) { 
        combinationsAux("", s); 
    }
    
    private static void combinationsAux(String prefix, String s) {
        if(0 == s.length()){
            System.out.print(prefix + " ");
        }else{
            combinationsAux(prefix+s.charAt(0), s.substring(1));
            combinationsAux(prefix, s.substring(1));
        }   
    }
}
