package PracticeExamples;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max=0;
        int counter=0;
        for(int i=0; i<candles.size();i++){
            if(candles.get(i)>max){
                max=candles.get(i);
            }
        }
        for(int i=0; i<candles.size();i++){
            if(candles.get(i)==max){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) throws IOException {
	   /* You are in charge of the cake for a child's birthday. You have decided the cake will have one
	     candle for each year of their total age. They will only be able to blow out the tallest of the candles.
	     Count how many candles are tallest.
	     candles=[4,4,1,3]
         The maximum height candles are 4 units high. There are 2 of them, so return 2.
	    */
                List<Integer> candles= new ArrayList<>(List.of(4,1,4,3));
                List<Integer> candles2= new ArrayList<>(List.of(7,10,4,10,10));
                List<Integer> candles3= new ArrayList<>(List.of(4,5,5,7,3));

                int result = BirthdayCakeCandles.birthdayCakeCandles(candles);
                int result2 = BirthdayCakeCandles.birthdayCakeCandles(candles2);
                int result3 = BirthdayCakeCandles.birthdayCakeCandles(candles3);
                System.out.println(result);
                System.out.println(result2);
                System.out.println(result3);

            }
        }





