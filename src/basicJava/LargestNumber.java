package basicJava;

//find the largest number out of 3 using if else statement
public class LargestNumber {
    public static void main(String[] args) {
        int a = 13, b = 6, c = 7;
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}
