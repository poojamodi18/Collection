package stringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1 : ");
        String str1 = sc.nextLine();
        System.out.print("String 2 : ");
        String str2 = sc.nextLine();
        System.out.print("Shuffle string : ");
        String string = sc.nextLine();
        if (str1.length() + str2.length() == string.length()) {
            validString(str1, str2, string);
        }
        else {
            System.out.println("Line is not a valid shuffle of two strings");
        }
    }

    private static void validString(String str1, String str2, String string) {
        String sum = str1+str2;
        char[] chars = sum.toCharArray();
        char[] charStr = string.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charStr);
        int i=0;
        while (i<charStr.length){
            if (chars[i] == charStr[i]){
                i++;
            }else {
                System.out.println("Not a valid shuffle string");
                return;
            }
        }
        System.out.println("Valid shuffle string");
    }
}
