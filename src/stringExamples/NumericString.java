package stringExamples;

import java.util.Scanner;

//check if the string is numeric or not
public class NumericString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.isEmpty()){
            System.out.println("Empty");
        }else {
            try{
                int number = Integer.parseInt(str);
                System.out.println(number);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
    }
}
