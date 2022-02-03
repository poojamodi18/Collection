package functionExamples;

import java.util.Scanner;

public class OctalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary : ");
        System.out.println("Binary to Octal "+binaryToOctal(sc.nextLong()));
        System.out.print("Enter Octal : ");
        System.out.println("Octal to Binary "+octalToBinary(sc.nextInt()));
    }
    static int binaryToOctal(long number) {
        int pow = 0, decimal = 0;
        int octal = 0, i = 1;
        while (number != 0) {
            int n = (int) number % 10;
            decimal += Math.pow(2, pow) * n;
            number = number / 10;
            pow++;
        }
        while (decimal != 0) {
            int n = decimal % 8;
            decimal = decimal / 8;
            octal += n * i;
            i *= 10;
        }
        return octal;
    }

    static long octalToBinary(int number) {
        int pow = 0, decimal = 0;
        while (number != 0) {
            int n = number % 10;
            decimal += Math.pow(8, pow) * n;
            number = number / 10;
            pow++;
        }
        long binary = 0, i = 1;
        while (decimal != 0) {
            int n = decimal % 2;
            decimal = decimal / 2;
            binary += n * i;
            i *= 10;
        }
        return binary;
    }
}
