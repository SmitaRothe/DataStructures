package Recursion;

public class strCount {

    /* Given a string and a non-empty substring sub, compute recursively the number of times that sub
     appears in the string, without the sub strings overlapping.

     strCount("catcowcat", "cat") → 2
     strCount("catcowcat", "cow") → 1
     strCount("catcowcat", "dog") → 0
     */
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));

        int[] nums= new int[]{3, 1, 3, 1, 3};
        System.out.println(haveThree(nums));
    }
    public static int strCount(String str, String sub) {
        if(str.length()<sub.length()){
            return 0;
        }
        if(str.substring(0, sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);

        return strCount(str.substring(1), sub);
    }


    public static boolean haveThree(int[] nums) {
        int count3=0;
        if(nums.length<=2){
            return false;
        }
        for(int i=0;i<nums.length-1; i++){
            if(nums[i]==3 && nums[i+1]==3){
                return false;
            }
            if(nums[i]==3){
                count3++;
            }
        }
        return count3==3;
    }
}
