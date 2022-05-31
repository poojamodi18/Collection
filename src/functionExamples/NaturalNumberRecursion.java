package functionExamples;

import java.util.Scanner;

//find natural number sum using recursion
public class NaturalNumberRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println("Sum of Natural number till N : "+sum(n));
    }
    static int sum(int num){
        if(num !=0){
            return num + sum(num-1);
        }else {
            return num;
        }
    }
}
