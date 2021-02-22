package Tree;

import ArrayExample.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
       // List<Integer> arr= new ArrayList<>() {1,2,3,4,5};
       // List<Integer> arr= new ArrayList<>() {1,2,3,4,5};

        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(rotateLeft(1,arr));
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        for (int i = 0; i < d; i++) {
            int temp = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {

                arr.set(j, arr.get(j + 1));
            }
            arr.set(arr.size() - 1, temp);
        }
        return arr;
    }
}
