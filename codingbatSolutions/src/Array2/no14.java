package Array2;

public class no14 {

    /* Given an array of ints, return true if it contains no 1's or it contains no 4's.
    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true
     */

    public boolean no14(int[] nums) {
        boolean ones=false;
        boolean fours=false;
        boolean status= false;
        if(nums.length>=1){
            for(int i=0; i<nums.length; i++){
                if(nums[i]==1){
                    ones=true;
                }
                if(nums[i]==4){
                    fours=true;
                }
            }
        }
        if(ones!=true|| fours!=true){
            status=true;
        }
        return status;
        //return !ones || !fours;
    }



}
