package decisionMakingExamples;

import java.util.Scanner;

//display the list of factors of given number
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int number = sc.nextInt();
        System.out.println("Factors of " + number + " : ");
        if (number > 0)
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        else if (number < 0) {
            for (int i = number; i <= Math.abs(number); i++) {
                if(i == 0) continue;
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
