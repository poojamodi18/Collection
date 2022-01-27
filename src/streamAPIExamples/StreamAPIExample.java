package streamAPIExamples;

import java.util.Arrays;
import java.util.Scanner;

/*
Read the string array
Print only the words with even length in sorted order
kiwi orange lemon -> kiwi orange
 */
public class StreamAPIExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        String[] words = Arrays.stream(line)
                .filter(w -> w.length() % 2 == 0)
                .sorted()
                .toArray(String[]::new);

        //sorted(Comparator.naturalOrder())    ascending order
        //sorted(Comparator.reverseOrder())    descending order
        //sorted(Comparator.comparing(word -> word.length()))   sort according to the length of words in ascending order

        for (Object word : words) {
            System.out.println(word);
        }

        /*
        To directly print or do other operation with storing it in another variable
        Arrays.stream(line)
                .filter(w -> w.length() % 2 == 0)
                .sorted()
                .forEach(System.out::println);
         */
    }
}
