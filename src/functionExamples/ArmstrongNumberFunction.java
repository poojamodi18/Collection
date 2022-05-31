package functionExamples;

import java.util.Scanner;

public class ArmstrongNumberFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong Number between n and m");
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("m : ");
        int m = sc.nextInt();
        while (n <= m) {
            if (checkArmstrongNumber(n)) {
                System.out.print(n + " ");
            }
            n++;
        }
    }

    static boolean checkArmstrongNumber(int number) {
        int pow = String.valueOf(number).length();
        int original = number, armstrong = 0;
        while (number != 0) {
            int n = number % 10;
            armstrong += Math.pow(n, pow);
            number = number / 10;
        }
        return armstrong == original;

    }
}
