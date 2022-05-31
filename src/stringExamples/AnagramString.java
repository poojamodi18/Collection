package stringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str1 = sc.nextLine();
        System.out.print("String : ");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length()){
            char[] charArray1 = str1.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);


            if(Arrays.equals(charArray1,charArray2)){
                System.out.println("Anagram");
            }

        }else {
            System.out.println("Not Anagram");
        }

    }
}
