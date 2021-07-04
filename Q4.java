
// Author: Muhsin Mansoor    Dated: 27/05/2021
// Motive:Q4:	Write Java program to read the three integers a, b and c from the keyboard and then print the largest value read.
import java.util.Scanner;
import java.util.Arrays;

public class Q4 {
    public static Integer largestOfThree(int x, int y, int z) {
        // Algorithm for Maximum of three numbers(Using if-else)
        if (x >= y && y >= z) {
            return x;
        } else if (y >= z && z >= x) {
            return y;
        } else
            return z;
    }

    public static Integer largestOfN1(int A[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A[n - 1];
    }

    public static int largestOfN2(int A[], int n) {
        Arrays.sort(A);
        return A[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the three integers");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.print("The largest of three numbers is: " + largestOfThree(a, b,
        // c));
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        System.out.println("Enter the Integers:");
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("The largest number is: " + largestOfN1(num, n));

    }
}
