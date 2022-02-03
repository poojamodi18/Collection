package decisionMakingExamples;

import java.util.Scanner;

//display list of prime number between 2 given number
public class PrimeNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime number between n and m");
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("m : ");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            boolean prime = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = true;
                    break;
                }
            }
            if (!prime) {
                System.out.print(i + " ");
            }
        }
    }
}