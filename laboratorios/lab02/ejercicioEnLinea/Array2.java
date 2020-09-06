
package Lab2;

public class Array2{
    public int countEvens(int[] nums) {
        int pares = 0;                              //C1
        for(int i = 0; i < nums.length; i++){       //(C2+C3)*n
            if(nums[i] % 2 == 0){                   //C4*n
                pares++;                            //C5*n
            }
        }
        return pares;                               //C6
    }                                               //O(n)

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max-min;
    }
    
    public int[] zeroFront(int[] nums) {
        int variableAux;
        for(int i = 0; i < nums.length; i++){
            for(int a = 0; a < nums.length-1; a++){
                if(nums[a]!=0){
                    variableAux = nums[a];
                    nums[a] = nums[a+1];
                    nums[a+1] = variableAux;
                }
            }
        }
        return nums;
    }
    
    public boolean tripleUp(int[] nums) {
        boolean indicador = false;
        for(int i = 0; i < nums.length-2; i++){
            if((nums[i]==nums[i+1]-1)&&(nums[i+1]==nums[i+2]-1)){
                indicador = true;
            }
        }
        return indicador;
    }
    
    public boolean isEverywhere(int[] nums, int val) {
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]!=val&&nums[i+1]!=val){
                return false;
            }
        }
        return true;
    }
}
