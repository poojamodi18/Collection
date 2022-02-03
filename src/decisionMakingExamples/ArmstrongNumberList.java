package decisionMakingExamples;

import java.util.Scanner;

//display list of Armstrong numbers between 2 given numbers
public class ArmstrongNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong numbers between n and m ");
        System.out.print("n : ");
        int first = sc.nextInt();
        System.out.print("m : ");
        int last = sc.nextInt();
        for (int i = first; i < last; i++) {
            int num = i,armstrong = 0;
            int pow = String.valueOf(i).length();
            while (num != 0) {
                int n = num % 10;
                armstrong += Math.pow(n, pow);
                num = num / 10;
            }
            if (armstrong == i) {
                System.out.println(i);
            }
        }
    }
}
