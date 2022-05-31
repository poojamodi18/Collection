package decisionMakingExamples;

import java.util.Scanner;

//count number of digit in a numerical value using while loop
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        long number = sc.nextLong();
        int count = 0;
        while (number !=0){
            number = number / 10;
            count++;
        }
        System.out.println("Total digits in number : "+count);
    }
}
