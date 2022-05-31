package arrayExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        Integer[] array = Arrays.stream(line).map(n -> Integer.parseInt(n)).toArray(Integer[]::new);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        System.out.println("average : "+sum/array.length);
    }

}
