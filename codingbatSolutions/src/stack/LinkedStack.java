
package stack;

//import linkedListArray.LinkedListArray;

import java.util.*;

public class LinkedStack {

        private LinkedList<Employee> stack;

        public LinkedStack(){
            stack = new LinkedList<>();
        }

        public void push(Employee emp){
            stack.push(emp);
        }

        public Employee pop(){
            return stack.pop();
        }

        public Employee peek(){
            return stack.peek();
        }

        public boolean isEmpty(){
            return stack.isEmpty();
        }

        public void printStack(){
            ListIterator<Employee> iterator = stack.listIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }


