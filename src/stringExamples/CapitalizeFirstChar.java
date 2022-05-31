package stringExamples;

import java.util.Scanner;

public class CapitalizeFirstChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        StringBuilder str = new StringBuilder(sc.nextLine().toLowerCase());
        System.out.println(str.length());
        str.setCharAt(0,Character.toUpperCase(str.charAt(0)));
        for (int i = 0; i < str.length()-1; i++) {
            char space = str.charAt(i);
            char ch = str.charAt(i+1);
            if(Character.isSpaceChar(space)){
                if(Character.isAlphabetic(ch)){
                    str.setCharAt(i+1,Character.toUpperCase(ch));
//                    System.out.println(Character.toUpperCase(ch));
                }
            }
        }
        System.out.println(str);
    }
}
