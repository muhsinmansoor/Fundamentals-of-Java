import java.util.Scanner;
import java.lang.Math;

// Author: Muhsin Mansoor    Dated: 20/06/2021
// Motive: Q9. Write java program to calculate the Sum of the any power of first n natural numbers.
public class Q9 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long sum = 0;
        int n = sc.nextInt();
        int pow = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            double a = Math.pow(i, pow);
            sum += a;
        }
        System.out.println(sum);
    }
}
