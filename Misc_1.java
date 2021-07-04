
// Author: Muhsin Mansoor    Dated: 15/05/2021
// Motive: Percentage calculator of marks.
import java.util.Scanner;

public class Misc_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.print("\nEnter the Roll number of the student: ");
        String roll = sc.next();

        int marks[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("\n\nEnter the Marks of the student in subject %d :", i + 1);
            marks[i] = sc.nextInt();
        }
        if (marks[0] >= 0 && marks[1] >= 0 && marks[2] >= 0 && marks[3] >= 0 && marks[4] >= 0 && marks[0] <= 100
                && marks[1] <= 100 && marks[2] <= 100 && marks[3] <= 100 && marks[4] <= 100) {
            System.out.println("\n\n\t\tReport Card\t\t ");
            System.out.print("Name of the student:  " + name + "\nRoll No.:  " + roll + "\n\n");
            for (int i = 0; i < 5; i++) {
                System.out.printf("Subject %d          %d \n", i + 1, marks[i]);
            }
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += marks[i];
            }
            System.out.println("Total Marks: " + sum);
            System.out.print("Percentage: " + (float) sum / 5);
        } else {
            System.out.println("You have entered wrong marks.");

        }
    }
}