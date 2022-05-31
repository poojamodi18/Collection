package stringExamples;

import java.util.Scanner;

//check if the string contains substring or not
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String line = sc.nextLine();
        System.out.print("Enter word : ");
        String word = sc.nextLine();
        if(line.contains(word)){
            System.out.println(word+" is in the sentence");
        }
        else{
            System.out.println(word+" not found in the sentence");
        }
    }
}
