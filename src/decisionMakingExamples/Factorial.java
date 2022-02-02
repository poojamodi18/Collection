package decisionMakingExamples;

import java.util.Scanner;

//calculate factorial of given number
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate factorial : ");
        int num = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial *  i;
        }
        System.out.println(num + "! = " + factorial);
    }
}
