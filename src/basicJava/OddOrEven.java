package basicJava;

import java.util.Scanner;
//check the entered number is odd or even
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number "+num +" is Even");
        }else {
            System.out.println("Number "+num +" is Odd");
        }
        // String evenOdd = (num % 2 == 0) ? "even" : "odd";
    }
}
