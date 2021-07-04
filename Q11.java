import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// Author: Muhsin Mansoor    Dated: 20/06/2021
/* Motive: Q11. Write a program to calculate the grade of a student. There are five subjects. Marks in each subject are entered from keyboard. Assign grade based on the following rule:
Total Marks >= 90 	Grade: Ex
90 > Total Marks >= 80 	Grade: A
80 > Total Marks >= 70 	Grade: B
70 > Total Marks >= 60 	Grade: C
60 > Total Marks  	Grade: F */
public class Q11 {
    public static Scanner sc = new Scanner(System.in);

    public static String grade(int num) {
        if (num >= 90)
            return "Ex";
        else if (num >= 80 && num < 90)
            return "A";
        else if (num >= 70 && num < 80)
            return "B";
        else if (num >= 60 && num < 70)
            return "A";
        else
            return "F";
    }

    public static void main(String[] args) {
        int mrks = sc.nextInt();
        if (mrks <= 100 && mrks >= 0) {
            System.out.println(grade(mrks));
        } else
            System.out.println("Invalid Marks!");
    }
}
