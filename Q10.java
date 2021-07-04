import java.util.Scanner;

// Author: Muhsin Mansoor    Dated: 20/06/2021
// Motive: Q10. Write java program to calculate the Factorial of a n (iteratively and recursively).
public class Q10 {
    public static Scanner sc = new Scanner(System.in);

    public static int facByIteration(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }
    public static int facByRecursion(int num) {
        if(num == 0){
            return 1;
        }
        else
        return num * facByRecursion(num-1);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(facByIteration(n));
        System.out.println(facByRecursion(n));

    }

}
