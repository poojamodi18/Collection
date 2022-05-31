package basicJava;

import java.util.Scanner;

//check whether the alphabet is vowel or consonant
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one alphabet : ");
        char ch = sc.next().charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println("Enter value is Number");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }
    }
}
