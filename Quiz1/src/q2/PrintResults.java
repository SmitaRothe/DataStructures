package q2;

public class PrintResults {

    /* Write a program to calculate how many correct answers the students had in the multiplechoice exam.
       This program has a method to take all the answers with the answer key and prints
       the results.
      answer key is => {c, b, a, b}
      output=>
      “Student 1 had 2 correct answer(s)”
      “Student 2 had 0 correct answer(s)”
      “Student 3 had 1 correct answer(s)”
     */

    public static void main(String[] args) {
        //char[] answers = new char[4];
        char[] key= new char[]{'c','b','a','b'};

        char[][] answers={{'a', 'b', 'd', 'b'},
                          {'b', 'a', 'c', 'd'},
                          {'a', 'b', 'c', 'd'}};
        printResults(answers, key);
    }
    public static void printResults(char[][] answers,char[] key) {
        int count = 0;
        System.out.println(answers.length);
        System.out.println(key.length);

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (answers[i][j] == key[j]) {
                    count++;    //if equal then increment the counter
                }
            }
            System.out.println("Student " + (i+1) + " had " + count + " correct answers");
            count = 0;
        }
    }
}
