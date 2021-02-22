package ExamPracticeDataStructures;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SortingArraysOfDates {
    public static void main(String[] args) {
        String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"};

        System.out.println("Before sorting: " + Arrays.toString(fruits));

        Arrays.sort(fruits);

        System.out.println("After sorting: " + Arrays.toString(fruits));

        Date[] dates = new Date[3];
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            dates[0] = dateFormatter.parse("2013-09-30");
            dates[1] = dateFormatter.parse("2013-07-06");
            dates[2] = dateFormatter.parse("2013-11-28");
        } catch (ParseException ex) {
            System.err.print(ex);
        }

        System.out.println("Before sorting: " + Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println("After sorting: " + Arrays.toString(dates));

        Employee[] newEmployees = new Employee[4];

        newEmployees[0] = new Employee("Tom", 45, 80000);
        newEmployees[1] = new Employee("Sam", 56, 75000);
        newEmployees[2] = new Employee("Alex", 30, 120000);
        newEmployees[3] = new Employee("Peter", 25, 60000);

        System.out.println("Before sorting: " + Arrays.toString(newEmployees));

        //Arrays.sort(newEmployees, new EmployeeSalaryComparator());

        System.out.println("After sorting: " + Arrays.toString(newEmployees));
    }

    public static class Employee{
        private String name;
        private int age;
        private int salary;

        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
        // getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }

}
