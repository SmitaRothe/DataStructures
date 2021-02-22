package ExamPracticeDataStructures;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayList {

    public static void main(String args[]){
        List<Integer> numbers = List.of(2, 3, 5, 7);
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Jessica");
        alist.add("Angela");
        alist.add("Tom");

        //displaying elements
        System.out.println(alist);

        //Adding "Steve" at the fourth position
        alist.add(3, "Steve");

        //displaying elements
        System.out.println(alist);
    }
}
