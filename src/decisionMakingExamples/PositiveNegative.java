package decisionMakingExamples;

import java.util.Scanner;

//check whether the given number is positive or negative
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        double num = sc.nextDouble();
        if(num == 0.0 ){
            System.out.println("Number is zero");
        }else if(num > 0.0){
            System.out.println("Number is positive");
        }else if(num < 0.0){
            System.out.println("Number is negative");
        }
    }
}
