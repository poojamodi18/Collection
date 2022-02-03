package functionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//pass lambda expression as argument using arraylist for replaceAll and forEach
public class LambdaArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, line);
        System.out.println(list);
        list.replaceAll(str -> str.toUpperCase());

        list.forEach(str -> {
            if(str.length()>3)
            System.out.println(str);
        });
    }
}
