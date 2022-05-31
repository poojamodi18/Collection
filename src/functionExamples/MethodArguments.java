package functionExamples;

import java.util.Scanner;

//Pass call to method as argument
public class MethodArguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int number = sc.nextInt();
        System.out.println(palindromeNumber(number, reverseNumber(number)));
    }

    static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int n = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + n;
        }
        System.out.println(reverse);
        return reverse;
    }

    static String palindromeNumber(int original, int reverse) {
        if (original == reverse) {
            return original + " is Palindrome Number";
        } else {
            return original + " is Not Palindrome Number";
        }
    }
}
