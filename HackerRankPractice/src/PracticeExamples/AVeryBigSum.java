package PracticeExamples;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AVeryBigSum {
    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum=0;
        for(int i=0; i<ar.length;i++){
            sum=sum+ar[i];
        }
        return sum;
    }

    /* Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

     */
    public static void main(String[] args) {
        long[] ar = new long[]{1000000001 ,1000000002 ,1000000003 ,1000000004 ,1000000005};

        long result = aVeryBigSum(ar);
        System.out.println(result);
    }
}
