package decisionMakingExamples;

import java.util.Scanner;

//Fibonacci series of n numbers
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for Fibonacci Series : ");
        int number = sc.nextInt();
        int ans1 =0, ans2=1, sum;
        for (int i = 0; i < number; i++) {
            System.out.print(ans1+" ");
            sum = ans1 + ans2;
            ans1 = ans2;
            ans2 = sum;
        }
    }
}
