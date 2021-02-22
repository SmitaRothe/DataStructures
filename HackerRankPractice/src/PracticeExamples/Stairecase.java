package PracticeExamples;

import java.util.Scanner;

public class Stairecase {

    /* This is a staircase of size n=4 :
      pattern1:     #
                    ##
                    ###
                    ####
       pattern2:     #
                    ##
                   ###
                  ####
     Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
     Write a program that prints a staircase of size n.
     */

    public static void main(String[] args) {
        //print staircase in pattern 1
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("staircase in pattern1");
        staircasePattern1(n);
        System.out.println("staircase in pattern2");
        staircasePattern2(n);
        System.out.println("staircase in pattern3");
        staircasePattern3(n);

    }
    //print staircase in pattern1
    static void staircasePattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    //print staircase in pattern2
    static void staircasePattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j>=(n+1)-i){
                    System.out.print("#");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //print staircase in pattern3
    static void staircasePattern3(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}