package ExamPracticeDataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class UsingLinkedList {

    public static void main(String args[]){

        LinkedList<String> list=new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");

        //Adding an element to the first position
        list.addFirst("John");

        //Adding an element to the last position
        list.addLast("Michelle");

        //Adding an element to the 3rd position
        list.add(2, "Olena");

        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("#########################");
        //Removing First item
        list.removeFirst();
        System.out.println("After removing the first item==>");
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("#########################");
        //removing 2nd element, index starts with 0
        list.remove(1);

        System.out.print("\nAfter removing second element: ");
        //Iterating LinkedList again
        Iterator<String> iterator2=list.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next()+" ");
        }

        System.out.println();
        System.out.println("#########################");

        /* Add to a Position and remove from a position*/
        list.add(0, "ABC");
        list.remove(2);
        System.out.println("Final Content: " +list);

        // It checks whether the given item is present in the list or not.
        boolean var = list.contains("John");
        System.out.println(var);

        //It returns the item of the specified index from the list.
        Object var2 = list.get(2);
        System.out.println(var2);

        //It returns the index of the specified item.
        int a= list.indexOf("Steve");
        System.out.println("The index of Steve is: " + a);

        //It updates the item of specified index with the give value.
        list.set(2, "abc");
        System.out.println("Final Content: " +list);
    }
}

