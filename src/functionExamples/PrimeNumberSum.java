package functionExamples;

import java.util.Scanner;

//Check Whether a Number can be Expressed as Sum of Two Prime Numbers
public class PrimeNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int number = sc.nextInt();
        for (int i = 2; i <= number / 2; i++) {
            if (checkPrimeNumber(i)) {
                if (checkPrimeNumber(number - i)) {
                    System.out.println("Prime Pair : " + i + " + " + (number-i) + " = " + (number));
                }
            }
        }

    }

    static boolean checkPrimeNumber(int number) {
        boolean prime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
