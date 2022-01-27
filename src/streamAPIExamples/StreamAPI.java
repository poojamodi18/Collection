package streamAPIExamples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        double ans = Arrays.stream(new int[]{2, 4, 6, 8, 10})  // stream takes array of int as input
                .map(x -> {
                    x = x * x;   // perform square of each element of array
                    System.out.println(x);  // print the square
                    return x;  // return it back to map
                })
                .sum();  // perform addition of all values in map and return it to ans variable
        System.out.println("Sum : " + ans);

        //minimum even number
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})
                .filter(n -> n % 2 == 0);
        System.out.println(intStream.min());

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        IntSummaryStatistics stats = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0).summaryStatistics();
        System.out.println("Stats");
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());

    }
}
