package stack;


import java.util.EmptyStackException;

class Employee {

    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

}
public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        //check for the resize
        if(top==stack.length) {   //
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;
        }

        stack[top]=employee;
        top=top+1;
    }

    public Employee pop()  {
        //if it is empty throw EmptyStackException
        //return and decrease the size
        if(stack.length==0){
            throw new EmptyStackException();
        }
        //top--;
        Employee employee= stack[--top];

        stack[top]=null;      //remove the element
        return employee;
    }

    public Employee peek() {
        //if it is empty throw EmptyStackException
        //return the top of stack
        if(stack.length==0){
            throw new EmptyStackException();
        }

        return stack[top-1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
       for(int i=0; i<top;i++){
           System.out.println( stack[i]);
       }
    }
}
