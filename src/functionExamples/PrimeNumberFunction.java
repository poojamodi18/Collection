package functionExamples;

import java.util.Scanner;

//display prime numbers between two numbers using prime number method
public class PrimeNumberFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime Number between n and m");
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("m : ");
        int m = sc.nextInt();
        while (n<=m){
            if(checkPrimeNumber(n)){
                System.out.print(n+" ");
            }
            n++;
        }
    }
    static boolean checkPrimeNumber(int number){
        boolean prime = true;
        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}
