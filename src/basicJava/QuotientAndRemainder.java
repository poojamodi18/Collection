package basicJava;

//compute quotient and remainder
public class QuotientAndRemainder {
    public static void main(String[] args) {
        int divider = 145;
        int divisor = 4;
        int quotient = divider / divisor;
        int remainder = divider % divisor;
        System.out.println("Quotient of " + divider + "/" + divisor + " is : " + quotient);
        System.out.println("Remainder of " + divider + "/" + divider + " is : " + remainder);
    }
}
