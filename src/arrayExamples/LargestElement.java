package arrayExamples;

import java.util.Arrays;
import java.util.Comparator;

public class LargestElement {
    public static void main(String[] args) {
        Integer[] array = {34,56,78,45,2,45,67,90,12,34,76,54};
        int largest=0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>largest){
                largest = array[i];
            }
        }
        System.out.println("Largest number : "+largest);
        //using stream
        System.out.print("largest : ");
        Arrays.stream(array)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(System.out::println);
    }

}
