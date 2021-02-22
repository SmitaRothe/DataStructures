package ExamPracticeDataStructures;
import java.util.Scanner;

public class ReverseSentence {

        public static void main(String[] args) {
            // program for reversing the sentence

            Scanner data= new Scanner(System.in);
            System.out.println("Enter the sentence to reverse: ");
            String inputSentence= data.nextLine();
            //String s[] = "you shall not pass".split(" ");
            String s[]=inputSentence.split(" ");
            String ans = "";
            for (int i = s.length - 1; i >= 0; i--) {
                ans += s[i] + " ";
            }
            System.out.println("Reversed Sentence is: " + ans);

            //Program for reversing the sentence as well as the words
            //String sentence = "Go work";
            String reversed = reverse(inputSentence);  //call the method and pass the input sentence
            System.out.println("The reversed sentence with reversed string is: " + reversed);
        }

        public static String reverse(String sentence) {
            if (sentence.isEmpty())
                return sentence;
            //take the fist char and append at the end everytime you call the method again with remaining string
            return reverse(sentence.substring(1)) + sentence.charAt(0);
        }
    }


