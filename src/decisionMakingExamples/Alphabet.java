package decisionMakingExamples;

import java.util.Scanner;

//check whether the character is alphabet or not
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character : ");
        char ch = sc.next().charAt(0);
        if(Character.isDigit(ch)){
            System.out.println("Entered character is digit");
        }else if(Character.isAlphabetic(ch)){
            System.out.println("Entered character is alphabet");
        }

    }
}
