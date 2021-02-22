package Recursion;

public class endX {

    /* Given a string, compute recursively a new string where all the lowercase 'x' chars have been
    moved to the end of the string.
    endX("xxre") → "rexx"
    endX("xxhixx") → "hixxxx"
    endX("xhixhix") → "hihixxx"
     */
    public static void main(String[] args) {
        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }
    public static String endX(String str) {
        if(str.length()<=1){  //if length is 1 or less then return same string
            return str;
        }
        if(str.charAt(0)=='x'){  //if first char is x then append it to the end of the string
            return endX(str.substring(1))+"x";// and call the method again with substring from next char
        }
        return str.charAt(0)+ endX(str.substring(1));
    }

}
