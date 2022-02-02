package decisionMakingExamples;

import java.util.Scanner;

//find GCD of two numbers
public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st Number for GCD & LCM : ");
        int num1 = sc.nextInt();
        System.out.print("2nd Number for GCD & LCM : ");
        int num2 = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if(num1% i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        int lcm = (num1*num2) / gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    }
}
