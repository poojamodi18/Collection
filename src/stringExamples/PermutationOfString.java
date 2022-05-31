package stringExamples;
import java.util.Scanner;

//Permutation of string
public class PermutationOfString {
    //TODO: Permutation of String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str =sc.nextLine();

        char[] charArray = str.toCharArray();

        //permutationCal(str,"");

    }

    /*private static void permutationCal(String str, String s) {
        if(str.length()==0){
            System.out.print(s+" ");
            return;
        }else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String rest = str.substring(0,i) + str.substring(i);

                permutationCal(s,(rest+ch));
            }
        }
    }*/
}
