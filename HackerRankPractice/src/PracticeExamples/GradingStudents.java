package PracticeExamples;

import java.util.*;

public class GradingStudents {

    /* HackerLand University has the following grading policy:
        Every student receives a grade in the inclusive range from 0 to 100.
        Any grade less than 40 is a failing grade.
        Sam is a professor at the university and likes to round each student's grade according to these rules:
        If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
        If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
        Examples

         grade= 84 round to  (85 - 84 is less than 3)
         grade = 29 do not round (result is less than 40)
         grade = 57 do not round (60 - 57 is 3 or higher)
     */
    public static void main(String[] args) {
        List<Integer> grades = List.of(4,84,64,76,29);
        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        ArrayList<Integer> grades2= new ArrayList<Integer>();
        int students= grades.get(0);
        for(int i=0;i<students; i++) {
            int x = grades.get(i + 1) / 5;
            int newGrade = (x + 1) * 5;

            if (grades.get(i + 1) < 38) {
                grades2.add(grades.get(i + 1));
            } else {
                    if (newGrade - grades.get(i + 1) < 3) {
                        grades2.add(newGrade);
                    } else {
                        grades2.add(grades.get(i + 1));
                    }
            }
        }
        return grades2;
    }

}
