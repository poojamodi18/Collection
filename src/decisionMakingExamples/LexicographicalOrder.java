package decisionMakingExamples;

import java.util.Scanner;

//sort the array of string in Lexicographical order(dictionary order)
public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String[] array = sc.nextLine().split(" ");
        int index = 0;
        while (index < array.length - 1) {
            if(array[index].compareTo(array[index+1])>0)
            {
                String temp = array[index];
                array[index] = array[index+1];
                array[index+1] = temp;
                index = 0;
            }
            else {
                index++;
            }
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}
