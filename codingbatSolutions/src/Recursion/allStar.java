package Recursion;

public class allStar {

    /* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
    allStar("hello") → "h*e*l*l*o"
    allStar("abc") → "a*b*c"
    allStar("ab") → "a*b"
     */

    public static void main(String[] args) {
        System.out.println(allStar("hello"));  // → "h*e*l*l*o"
        System.out.println(allStar("abc")); //→ "a*b*c"
        System.out.println(allStar("ab"));// → "a*b"
    }

    public static String allStar(String str) {
        if(str.length()<=1){
            return str;
        }
        return str.charAt(0)+"*"+allStar(str.substring(1));
    }
}
