package basicJava;

import java.util.Scanner;
//Print an integer entered by user
public class PrintAnInteger {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Number : "+number);
    }
}
