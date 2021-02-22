package Array2;

public class countEvens {

    /*Return the number of even ints in the given array. Note: the % "mod" operator
     computes the remainder, e.g. 5 % 2 is 1.
     countEvens([2, 1, 2, 3, 4]) → 3
     countEvens([2, 2, 0]) → 3
     countEvens([1, 3, 5]) → 0
     */

    public int countEvens(int[] nums) {
        //initialize the counter for even numbers
        int count=0;
        //loop through all of the array elements to get count of even numbers
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                count=count+1;
            }
        }
        return count;
    }

}
