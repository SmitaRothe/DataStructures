package ExamPracticeDataStructures;

import java.util.*;

public class UsingHashmap {

    public static void main(String args[]) {

        // declare HashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        //Adding elements to HashMap
        hashMap.put(12, "Tiya");
        hashMap.put(2, "Mary");
        hashMap.put(7, "Jessica");
        hashMap.put(49, "John");
        hashMap.put(3, "James");

        //Display content using Iterator
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry E = (Map.Entry) iterator.next();
            System.out.print("key is: " + E.getKey() + " & Value is: ");
            System.out.println(E.getValue());
        }
        System.out.println("###############################");

        //Get values based on key
        String var= hashMap.get(2);
        System.out.println("Value at index 2 is: "+var);
        System.out.println("###############################");
        /* Remove values based on key*/
        hashMap.remove(3);

        System.out.println("Map key and values after removal of key-3:");
        Set set2 = hashMap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry E2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+E2.getKey() + " & Value is: ");
            System.out.println(E2.getValue());
        }
    }
}
