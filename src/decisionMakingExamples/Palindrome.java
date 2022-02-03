package decisionMakingExamples;

import java.util.Scanner;

//Check whether word and number is Palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word or number to  check palindrome : ");
        String original = sc.next();
        StringBuilder reverse = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            char ch = original.charAt(i);
            reverse.append(ch);
        }
        if (original.equals(reverse.toString())) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
