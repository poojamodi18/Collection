package streamAPIExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Read a list of numbers
Print largest 3, if there are less than 3, print them all
 */
public class StreamAPIExampleOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        Arrays.stream(line)
                .map(word -> Integer.parseInt(word))
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
