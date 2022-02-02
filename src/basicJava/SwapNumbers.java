package basicJava;

/*
Swap two numbers
1 - with using temp variable
2 - without temp variable
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 100;
        int b = 77;
        System.out.println("Before swapping \nnumber 1 = " + a + "\nnumber 2 = " + b);
        //with temp number
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping \nnumber 1 = " + a + "\nnumber 2 = " + b);
        //without temp swap it back to original value
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping \nnumber 1 = " + a + "\nnumber 2 = " + b);


    }
}
