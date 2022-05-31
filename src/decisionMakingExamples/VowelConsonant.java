package decisionMakingExamples;

import java.util.Scanner;

//count the total occurrence of vowels and consonants in a sentence
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        int vowel = 0, cons = 0, space = 0, digit = 0, other = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isDigit(ch)) {
                digit++;
            } else if (Character.isSpaceChar(ch)) {
                space++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if (ch >= 'a' && ch <= 'z') {
                cons++;
            }else{
                other++;
            }
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + cons);
        System.out.println("Spaces : " + space);
        System.out.println("Digits : " + digit);
        System.out.println("Other : "+other);
    }
}
