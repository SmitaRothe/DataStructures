package Recursion;

public class array220 {

    /* Given an array of ints, compute recursively if the array contains somewhere a value followed in the
     array by that value times 10. We'll use the convention of considering only the part of the array that
     begins at the given index. In this way, a recursive call can pass index+1 to move down the array.
     The initial call will pass in index as 0.
     */

    public static void main(String[] args) {
        //array220([1, 2, 20], 0) → true
        //array220([3, 30], 0) → true
        //array220([3], 0) → false
        int[] nums= new int[]{1, 2, 20};
        System.out.println(array220(nums, 0));
        int[] nums2= new int[]{3, 30};
        System.out.println(array220(nums2, 0));
        int[] nums3= new int[]{3};
        System.out.println(array220(nums3, 0));
    }

    public static boolean array220(int[] nums, int index) {
        if(index>=nums.length-1){
            return false;
        }
        return nums[index+1]==nums[index]*10 || array220(nums,index+1);
    }



}
