package decisionMakingExamples;

import java.util.Scanner;

//Reverse a number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get reverse : ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number !=0) {
            int last = number % 10;
            number = number / 10;
            reverse = reverse * 10 + last;
        }
        System.out.println("Reverse : "+reverse);
    }
}
