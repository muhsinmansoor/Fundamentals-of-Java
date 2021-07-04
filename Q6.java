import java.util.Scanner;

// Author: Muhsin Mansoor    Dated: 20/06/2021
// Motive: Write Java program to calculate the perimeter and the area of the circle. The radius of the circle is taken as user input. Use to different functions to calculate the perimeter and area. Define the value of PI as class constant.
public class Q6{
    public static Scanner sc = new Scanner(System.in);
    public static final double PI = 3.14;
    public static void main(String[] args) {
        double rad = sc.nextDouble();
        System.out.println("The perimeter of circle is: "+ (2*PI*rad));
        System.out.println("The area of circle is: "+ (PI*rad*rad));
    }
}