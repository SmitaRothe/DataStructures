package Recursion;

public class countPairs {

    /* We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's
     make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute
     the number of pairs in the given string.
     countPairs("axa") → 1
     countPairs("axax") → 2
     countPairs("axbx") → 1
     */
    public static void main(String[] args) {
        System.out.println(countPairs("axa"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axbx"));
    }
    public static int countPairs(String str) {
        if(str.length()<=2){
            return 0;
        }
        if(str.charAt(0)==str.charAt(2)){            //if we find the same chars with one other char in between
            return 1+ countPairs(str.substring(1));  //then increment the counter
        }

        return countPairs(str.substring(1));    //otherwise go to substring from next char and ignore the previous char
    }



}
