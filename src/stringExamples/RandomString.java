package stringExamples;

import java.util.Random;
import java.util.Scanner;

//Generate Random String
public class RandomString {
    public static void main(String[] args) {
        String ref = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of random string : ");
        int num = sc.nextInt();
        System.out.print("No. of character in each string : ");
        int len = sc.nextInt();

        Random random = new Random();
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < len; j++) {
                System.out.print(ref.charAt(random.nextInt(ref.length())));
            }
            System.out.println();
        }

    }
}
