package PracticeExamples;

public class PlusMinus {
    /* Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
     Print the decimal value of each fraction on a new line with 6 places after the decimal.
     Example ==>   arr=[1,1,0,-1,-1]
     There are n=5 elements, two positive, two negative and one zero. Their ratios are 2/5=0.400000, 2/5=0.400000
     and 1/5=0.200000. Results are printed as:
        0.400000
        0.400000
        0.200000
     */

    public static void main(String[] args) {
        //int[] arr = new int[]{1,1,0,-1,-1};
        int[] arr = new int[]{2,1,4,0,-1,-6};

        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        float zero=0;
        float positive=0;
        float negative=0;

        int total=arr.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                zero++;
            else if(arr[i]<0)
                negative++;
            else
                positive++;
        }
        //now find out and print the ratio of the +ve, -ve, zero numbers
        System.out.printf("%1.6f ", positive / total);
        System.out.println();
        System.out.printf("%1.6f ", negative / total);
        System.out.println();
        System.out.printf("%1.6f ", zero / total);
        System.out.println();
    }
}
