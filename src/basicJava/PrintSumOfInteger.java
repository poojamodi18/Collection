package basicJava;

import java.util.Scanner;
//add two integer and display the sum on screen
public class PrintSumOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two number : "+sum);
    }
}
