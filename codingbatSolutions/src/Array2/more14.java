package Array2;

public class more14 {
    /* Given an array of ints, return true if the number of 1's is greater than the number of 4's
    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
     */

    public boolean more14(int[] nums) {
        boolean status=false;
        int fours=0;
        int ones=0;
        if(nums.length>=1){
            for(int i=0; i<nums.length; i++){
                if(nums[i]==1){
                    ones=ones+1;
                }
                if(nums[i]==4){
                    fours=fours+1;
                }
            }
        }
        if(ones>fours){
            status=true;
        }
        return status;
    }



}
