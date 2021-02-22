package q1;

public class SeparateString {

    /* Given a string, compute recursively a new string where all the adjacent chars are now
     separated by a "#"
    "program" → "p#r#o#g#r#a#m"
    "abc" → "a#b#c"
    "ab" → "a#b"
     */

    public static String separateString(String str){
         if(str.length()==0){
            return "Error: The string can not be null";
         }
         if(str.length()==1){   //if only one char then no need to add #
             return str;        //just return as it is
         }
     return str.charAt(0) + "#" +separateString(str.substring(1)); //in recursive loop it will add # between all chars
    }
}
