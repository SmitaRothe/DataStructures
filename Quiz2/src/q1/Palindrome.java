package q1;
import java.util.*;
import java.util.regex.Pattern;

public class Palindrome {
    /* 1- Using a stack, determine whether a string is palindrome
        String may contain punctuation and spaces. They should be ignored.
        Examples:
        1- “I did, did I?” => is a palindrome
        2- “Racecar” => is a palindrome
        3- “hello” => is not a palindrome
     */
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String str) {
        if (str.isEmpty())    //if string is empty then return false
            return false;

        Stack<Character> list = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {     //take all the characters from a string in a stack
            list.add(str.charAt(i));
        }
        String str2 = "";
        for (int i = 0; i < list.size(); i++) {
            //check the ascii values to add only letters to the new string str2
            if ((list.get(i)>=65 && list.get(i)<=90)||(list.get(i)>=97 && list.get(i)<=122)||(list.get(i)==32)) {
                str2 = str2 + list.get(i).toString();    //if it is a letter then add it to the string
            }else{
                str2=str2+" ";        //if not a letter then add space instead of that character
            }
        }

        String reverse = "";
        //reverse the string using for loop
        for (int j = str2.length() - 1; j >= 0; j--) {
            reverse = reverse + str2.charAt(j);
        }
        //System.out.println(str2);
        //System.out.println(reverse);
        if (str2.toLowerCase().equals(reverse.toLowerCase()))   //return true if the string is palindrome
             return true;

      return false;  //if not return false
    }
}