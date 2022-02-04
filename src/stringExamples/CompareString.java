package stringExamples;

import java.util.Scanner;

//compare string using == and equals()
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter a string : ");
        String str1 = sc.nextLine();
        if (str == str1) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal with ==");
        }
        if (str.equals(str1)) {
            System.out.println("equals with equals()");
        }

        System.out.println("STRING BUILDER");
        StringBuilder b1 = new StringBuilder(str);
        StringBuilder b2 = new StringBuilder(str1);
        System.out.println(b1);
        System.out.println(b2);
        if (b1 == b2) {
            System.out.println("Equal");
        }
        if (b1.toString().equals(b2.toString())) {     //StringBuilder does not override equals() method of object class
            System.out.println("builder equals");
        } else {
            System.out.println("Not equal");

        }
    }
}
