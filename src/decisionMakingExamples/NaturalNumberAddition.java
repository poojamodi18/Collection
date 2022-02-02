package decisionMakingExamples;

import java.util.Scanner;

//add natural number from 1 to n
public class NaturalNumberAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of natural number from 1 to " + n + " is : " + sum);
    }
}
