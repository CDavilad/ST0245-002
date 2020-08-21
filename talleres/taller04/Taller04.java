import java.util.Random;
public class Taller04{
    public static void main(String[] args){
        for (int n = 13; n<=33; n++){
            long ti = System.currentTimeMillis();
            SumaGrupoBasico(0, new int[n], 10);
            long tf = System.currentTimeMillis();
            System.out.println(tf - ti);
        }
        System.out.println("--------------------------------------");
        for (int n = 1003; n<1023; n++){
            long ti = System.currentTimeMillis();
            arrayMax(0, new int[n]);
            long tf = System.currentTimeMillis();
            System.out.println(tf - ti);
        }
    }

    public static int arrayMax(int start, int[] nums)
    {
        if(nums.length==0){ 
            return Integer.MIN_VALUE; 
        }else if(start==nums.length){ 
            return nums[start-1];
        }else{
            return Math.max(nums[start], arrayMax(start+1,nums));
        }
    }

    private static boolean SumaGrupoBasico(int start, int[]nums, int target){
        if (start == nums.length){ //c1
            return target == 0; //t(n) = c1+c2
        }else{
            return SumaGrupoBasico(start+1, nums, target) //T(n) = c3 + 2*T(n-1)
            || SumaGrupoBasico(start+1,nums,target-nums[start]);//T(n)=c1*2^(n-1)+c3*(2^n-1)
        }
    }

    public static int fibonacci(int n)  {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    } 
}
