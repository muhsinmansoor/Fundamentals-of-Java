import java.util.Scanner;

// Author: Muhsin Mansoor    Dated: 20/06/2021
// Motive:Write a program to check the number is even or odd. Input is taken from keyboard.
public class Q7 {
    private static Scanner sc = new Scanner(System.in);

    public static void checkByModulo(int number) {
        if (number % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
    public static void checkByBit(int number) {
        if ((number & 1) == 0) // &1 --> %2
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }


    public static void main(String[] args) {
        int num = sc.nextInt();
        checkByModulo(num);
        checkByBit(num);
    }
}
