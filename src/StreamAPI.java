import java.util.Arrays;

public class StreamAPI {
    public static void main(String[] args) {
        double ans = Arrays.stream(new int[]{2, 4, 6, 8, 10})  // stream takes array of int as input
                .map(x -> {
                    x = x * x;   // perform square of each element of array
                    System.out.println(x);  // print the square
                    return x;  // return it back to map
                })
                .sum();  // perform addition of all values in map and return it to ans variable
        System.out.print("Sum : " + ans);
    }
}
