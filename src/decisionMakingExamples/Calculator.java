package decisionMakingExamples;

import java.util.Scanner;

//make simple calculator that perform * / + -
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("Addition : +");
            System.out.println("Subtraction : -");
            System.out.println("Multiplication : *");
            System.out.println("Division : /");
            System.out.println("Exit : e");
            System.out.print("Choice : ");
            char ch = sc.next().charAt(0);
            int num1,num2,ans;
            switch (ch){
                case '+':
                    System.out.print("Enter number : ");
                    num1 = sc.nextInt();
                    System.out.print("Enter number : ");
                    num2 = sc.nextInt();
                    ans = num1+num2;
                    System.out.println("Addition = "+ans);
                    break;
                case '-':
                    System.out.print("Enter number : ");
                    num1 = sc.nextInt();
                    System.out.print("Enter number : ");
                    num2 = sc.nextInt();
                    ans = num1-num2;
                    System.out.println("Subtraction = "+ans);
                    break;
                case '*':
                    System.out.print("Enter number : ");
                    num1 = sc.nextInt();
                    System.out.print("Enter number : ");
                    num2 = sc.nextInt();
                    ans = num1*num2;
                    System.out.println("Multiplication = "+ans);
                    break;
                case '/':
                    System.out.print("Enter Divisor : ");
                    num1 = sc.nextInt();
                    System.out.print("Enter divider : ");
                    num2 = sc.nextInt();
                    ans = num1/num2;
                    System.out.println("Division = "+ans);
                    break;
                case 'e':
                    exit=false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (exit);
    }
}
