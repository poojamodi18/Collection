package decisionMakingExamples;

import java.util.Scanner;

//calculate power of number
public class NumberPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base= sc.nextInt();
        System.out.print("Enter Exponent : ");
        int exponent = sc.nextInt();
        int ans=1;
        for (int i = 1 ; i <= exponent; i++) {
            ans *= base;
        }
        System.out.println(base+"^"+exponent+" = "+ans);
    }
}
