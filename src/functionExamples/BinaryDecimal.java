package functionExamples;

import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal Number : ");
        int decimal = sc.nextInt();
        System.out.print("Binary Number : ");
        long binary = sc.nextLong();
        System.out.println(decimal + " to binary = " + decimalToBinary(decimal));
        System.out.println(binary + " to decimal = " + binaryToDecimal(binary));
    }

    static int binaryToDecimal(long number) {
        int pow = 0, decimal = 0;
        while (number != 0) {
            int n = (int) number % 10;
            decimal += Math.pow(2, pow) * n;
            number = number / 10;
            pow++;
        }
        return decimal;
    }

    static long decimalToBinary(int num) {
        long binary = 0, i = 1;
        while (num != 0) {
            int n = num % 2;
            num = num / 2;
            binary += n * i;
            i *= 10;
        }
        return binary;
    }
}
