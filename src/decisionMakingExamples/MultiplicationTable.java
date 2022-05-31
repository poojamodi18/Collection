package decisionMakingExamples;

import java.util.Scanner;

//create multiplication table of given number
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for multiplication table : ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number+" * "+ i +" = "+(i*number));
        }
    }
}
