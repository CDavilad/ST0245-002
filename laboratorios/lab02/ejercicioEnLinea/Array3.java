
public class Array3{
    public int[] fix34(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 3){
                for(int j = 0 ; j < nums.length; j++){
                    if (nums[j] == 4 && nums[j - 1] != 3){    
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4)) {
                    j++;
                }
                nums[j] = nums[i + 1];
                nums[i + 1] = 5;
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int sumaIz = 0;
        for(int i = 0; i < nums.length; i++){
            sumaIz = sumaIz + nums[i];
            int sumaDe = 0;
            for(int j = nums.length-1; j > i; j--){
                sumaDe = sumaDe + nums[j];
            }
            if(sumaIz == sumaDe){
                return true;
            }
        }
        return false;
    }
}
