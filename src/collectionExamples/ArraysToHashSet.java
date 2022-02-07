package collectionExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//convert array to hashset and vice-versa
public class ArraysToHashSet {
    public static void main(String[] args) {
        //array to set
        Integer[] numbers = {1,2,3,4,5,6,7};
        Set<Integer> number = new HashSet<>(Arrays.asList(numbers));
        System.out.println(number);
        //using stream
        Set<Integer> integerSet = Arrays.stream(numbers).collect(Collectors.toSet());
        integerSet.add(13);
        System.out.print("set : ");
        integerSet.forEach(num -> System.out.print(num+" "));

        //set to array
        System.out.println("\nArray of Integer");
        Integer[] numArray = number.toArray(new Integer[number.size()]);
        for (Integer integer : numArray) {
            System.out.print(integer+" ");
        }
        System.out.println();
        //using stream
        Integer[] array = integerSet.stream().toArray(Integer[]::new);
        for (Integer integer : array) {
            System.out.print(integer+" ");
        }

    }
}
