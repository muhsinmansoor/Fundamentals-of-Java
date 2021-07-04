// Author: Muhsin Mansoor    Dated: 27/05/2021
// Motive:Q5:	Write a Java Application to read the name of a student (studentName), roll Number (rollNo) and marks (totalMarks) obtained. rollNo may be an alphanumeric string. Display the data as read..
import java.util.Scanner;

public class Q5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String studentName = sc.nextLine();
        int totalMarks = sc.nextInt();
        String rollNo = sc.next();

        System.out.println(studentName);
        System.out.println(rollNo);
        System.out.println(totalMarks);
    }
}
