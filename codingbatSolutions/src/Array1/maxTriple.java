package com.company;

public class maxTriple {

    /*Given an array of ints of odd length, look at the first, last, and middle values
 in the array and return the largest. The array length will be a least 1.
 */

    public int maxTriple(int[] nums) {
        int big=0;
        if(nums.length>=1){
            if(nums[0]>nums[nums.length/2] &&nums[0]>nums[nums.length-1]){
                big=nums[0];
            }else if(nums[0]<nums[nums.length/2] &&nums[nums.length/2]>nums[nums.length-1]){
                big=nums[nums.length/2];
            }else if(nums[nums.length-1]>nums[0]&&nums[nums.length-1]>nums[nums.length/2]){
                big=nums[nums.length-1];
            }
        }
        return big;
    }
}
