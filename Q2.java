// Author: Muhsin Mansoor    Dated: 10/03/2021
// Motive: Q2:Write java program to add two numbers, take input as command line argument.
public class Q2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // Converting string into integer.
        int b = Integer.parseInt(args[1]);
        System.out.println("The sum is " + (a+b));
    }
}
