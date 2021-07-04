import java.util.Scanner;

// Author: Muhsin Mansoor    Dated: 20/06/2021
// Motive:Write a program to find out the number of days in a month using switch-case. Month number and year is taken as input through keyboard.
public class Q8 {
    private static Scanner sc = new Scanner(System.in);

    public static boolean leafYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (month > 0 && month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    System.out.println("The number of days is 31");
                    break;
                }
                case 2: {
                    if (leafYear(year)) {
                        System.out.println("The number of days is 29");
                    } else
                        System.out.println("The number of days is 28");
                    break;
                }
                default:
                    System.out.println("The number of days is 30");
                    // case 4:
                    // case 6:
                    // case 9:
                    // case 11:
            }
        } else
            System.out.println("Invalid Month number!");

    }
}
