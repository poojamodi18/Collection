package objectClassExamples;

import java.util.Scanner;

//create custom exception
class CheckedException extends Exception{
    CheckedException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) throws CheckedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor : ");
        int divisor = sc.nextInt();

        if(divisor == 0 )
            throw new CheckedException("Divisor 0 is invalid");
        else{
            System.out.println("Answer : "+(dividend/divisor));
        }

    }
}
