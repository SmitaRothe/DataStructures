package Array2;

public class haveThree {

    /* Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's
    are next to each other.
    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false
     */
    public static void main(String[] args) {
        int[] nums1= new int[]{3, 1, 3, 1, 3};
        haveThree(nums1);
        int[] nums2= new int[]{3, 1, 3, 3};
        haveThree(nums2);
        int[] nums3= new int[]{3, 4, 3, 3, 4};
        haveThree(nums3);
    }

    public static boolean haveThree(int[] nums) {
        int count=0;
        if(nums.length>=1 && nums[0]==3){
            count++;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==3&& nums[i]==3){
                return false;
            }
            if(nums[i]==3){
                count++;
            }
        }
        return count==3;
    }
}
