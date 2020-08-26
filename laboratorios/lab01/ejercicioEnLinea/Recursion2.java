/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio1;

public class Recursion2 {
    public boolean splitArray(int[] nums) {
        int i = 0;
        int suma1 = 0;
        int suma2 = 0;
        return splitArrayAux(nums, i, suma1, suma2);
   }

    private boolean splitArrayAux(int[] nums, int i, int suma1, int suma2){
        if(i >= nums.length){
            return suma1 == suma2;
        }else{
            return splitArrayAux(nums, i +1, nums[i] + suma1, suma2)||splitArrayAux(nums, i+1, suma1, suma2 + nums[i]);
        }
    }
    
    public boolean splitOdd10(int[] nums) {
        int i = 0;
        int suma1 = 0;
        int suma2 = 0;
        return splitOddAux(nums, i, suma1, suma2);
    }

    private boolean splitOddAux(int[] nums, int i, int suma1, int suma2){
        if(i >= nums.length){
            return (suma1 % 10 == 0  && suma2 % 2 != 0)||(suma2 % 10 == 0 && suma1 % 2 != 0); 
        }else{
            return splitOddAux(nums, i +1, nums[i] + suma1, suma2)||splitOddAux(nums, i+1, suma1, suma2 + nums[i]);
        }
    }
    
    public boolean groupSum6(int start, int[] nums, int target) {
        if(start == nums.length){
            return target ==0;
        }else return groupSum6(start+1, nums, target-nums[start]) || (groupSum6(start+1, nums, target)) && (nums[start] !=6);
    }
   
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }else {
            return groupNoAdj(start+2, nums, target-nums[start]) || groupNoAdj(start+1, nums, target);
        }
    }
    
    public boolean groupSum5(int start, int[] nums, int target) {
        if(start == nums.length){
            return target == 0;
        }if(nums[start] % 5 == 0 && start < nums.length - 1 && nums[start + 1] == 1){
            nums[start + 1] = 0;
        }if(groupSum5(start+1,nums,target-nums[start])){
            return true;
    }
    return nums[start] % 5 !=0 && groupSum5(start+1,nums,target);
    }
}
