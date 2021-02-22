package Array2;

public class sum28 {
    /* Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    sum28([2, 3, 2, 2, 4, 2]) → true
    sum28([2, 3, 2, 2, 4, 2, 2]) → false
    sum28([1, 2, 3, 4]) → false
     */

    public boolean sum28(int[] nums) {
        boolean AdditionIs8=false; //declare variable for checking if the addition is 8
        int sum2=0;  //declare variable for having sum of all 2's
        if(nums.length>=1){
            for(int i=0; i<nums.length;i++){
                if(nums[i]==2){
                    sum2=sum2+2;
                }
            }
        }
        if(sum2==8){
            AdditionIs8= true;
        }
        return AdditionIs8;
    }
}
