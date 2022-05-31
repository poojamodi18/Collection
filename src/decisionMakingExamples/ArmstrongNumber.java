package decisionMakingExamples;

import java.util.Objects;
import java.util.Scanner;

//check whether the given number is Armstrong or not
//153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int number = sc.nextInt();
        int original = number;
        int armstrong =0;
        int pow = String.valueOf(original).length();
        while (number!=0){
            int n = number % 10;
            armstrong += Math.pow(n, pow);
            number = number / 10;
        }
        if(armstrong == original){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
