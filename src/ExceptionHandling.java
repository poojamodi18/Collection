import java.util.Scanner;

class CustomException extends Exception {
    private int number;

    CustomException(int i) {
        number = i;
    }

    public String toString() {
        return number + " is invalid input";
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[9];
        int d = 0;

        try {
            System.out.println("Enter divisor : ");
            d = sc.nextInt();
            System.out.println("Enter number between 1 - 10 :");
            number[0] = sc.nextInt();
            if (number[0] > 10 || number[0] < 0) {
                throw new CustomException(number[0]);
            }
            System.out.println("Number at the index " + number[0] + " is 10" + number[number[0]]);
            System.out.println("Answer of Division " + (number[0] / d));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally Block - end");
        }
    }
}
