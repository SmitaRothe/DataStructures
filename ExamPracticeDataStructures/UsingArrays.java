package ExamPracticeDataStructures;

import java.util.Arrays;

public class UsingArrays {
    public static void main(String args[])
    {
        String arr[] = {"5", "1237637463746732323",
                "97987", "12" };
        sortLargeNumbers(arr);
        for (String s : arr)
            System.out.print(s + " ");
    }

    // Function for sort an array of large numbers
    // represented as strings
    static void sortLargeNumbers(String arr[])
    {

        Arrays.sort(arr, (left, right) ->
        {
            /* If length of left != right, then return the diff of the length else  use compareTo
               function to compare values.*/
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
    }
}
