package functionExamples;

import java.util.Scanner;

//find power of number using recursion
public class PowerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base : ");
        int base = sc.nextInt();
        System.out.print("Power : ");
        int pow = sc.nextInt();
        System.out.println("Answer : "+powerRecursion(base,pow));
    }
    static int powerRecursion(int num,int pow){
        if(pow>1){
            return num * powerRecursion(num, pow-1);
        }else {
            return num;
        }
    }
}
