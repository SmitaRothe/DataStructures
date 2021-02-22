package PracticeExamples;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    /* Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    For example, the square matrix arr is shown below:
                        1 2 3
                        4 5 6
                        9 8 9
   The left-to-right diagonal = 1+5+9=15. The right to left diagonal =3+5+9=17 . Their absolute difference is |15-17|=2.
     */

    public static void main(String[] args) {
        int[][] arr1= new int[][]{{1, 2, 3},{4,5,6},{9,8,9}};
        //List<List<Integer>> arr= new ArrayList<List>(List.of((1, 2, 3),(4,5,6),(9,8,9)));

        //List<Integer> candles2= new ArrayList<>(List.of(7,10,4,10,10));
        List<List<Integer>> arr= new ArrayList<List<Integer>>();
        List<Integer> inner1 = new ArrayList<Integer>(List.of(1, 2, 3));
        List<Integer> inner2 = new ArrayList<Integer>(List.of(4, 5, 6));
        List<Integer> inner3 = new ArrayList<Integer>(List.of(9, 8, 9));
        arr.add(inner1);
        arr.add(inner2);
        arr.add(inner3);
        int result = diagonalDifference(arr);
        System.out.println("The difference between the two diagonals is "+ result);
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int d1=0;
        int d2=0;
        for(int i=0; i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                // Condition for principal
                // diagonal
                if (i == j)
                    d1 += arr.get(i).get(j);

                // Condition for secondary
                // diagonal
                if ((i + j) == (arr.size() - 1))
                    d2 += arr.get(i).get(j);
            }
        }
        System.out.println("The values of d1 and d2 are: "+d1+" "+d2);
        return Math.abs(d1-d2);
    }



}
