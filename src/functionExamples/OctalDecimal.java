package functionExamples;

import java.util.Scanner;

public class OctalDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal Number : ");
        System.out.println("Decimal to Octal : "+decimalToOctal(sc.nextInt()));
        System.out.print("Octal Number : ");
        System.out.println("Octal to Decimal : "+octalToDecimal(sc.nextInt()));
    }
    static int octalToDecimal(long number) {
        int pow = 0, decimal = 0;
        while (number != 0) {
            int n = (int) number % 10;
            decimal += Math.pow(8, pow) * n;
            number = number / 10;
            pow++;
        }
        return decimal;
    }

    static int decimalToOctal(int num) {
        int octal = 0, i = 1;
        while (num != 0) {
            int n = num % 8;
            num = num / 8;
            octal += n * i;
            i *= 10;
        }
        return octal;
    }
}
