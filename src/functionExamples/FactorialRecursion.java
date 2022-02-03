package functionExamples;

import java.util.Scanner;

//find factorial of number using recursion
public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int number = sc.nextInt();
        System.out.println("Factorial : "+factorial(number));
    }
    static int factorial(int num){
        if(num!= 1){
            return num * factorial(num-1);
        }
        else {
            return num;
        }
    }
}
