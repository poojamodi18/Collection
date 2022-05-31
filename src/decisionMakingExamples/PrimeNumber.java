package decisionMakingExamples;

import java.util.Scanner;

//check whether the number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int number = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println(number+" is Prime");
        }else {
            System.out.println(number+" is not prime");
        }
    }
}
