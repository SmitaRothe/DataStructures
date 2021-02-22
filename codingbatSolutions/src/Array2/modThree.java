package Array2;

public class modThree {
    /* Given an array of ints, return true if the array contains either 3 even or 3 odd values all
    next to each other.
    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true
     */

    public int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n* factorial(n-1);
    }
}
