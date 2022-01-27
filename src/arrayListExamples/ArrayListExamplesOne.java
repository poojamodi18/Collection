package arrayListExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*sum all the adjacent equal numbers in a list of decimal numbers starting from left to right
        list = 3,3,6,1
        3+3 = 6
        list = 6,6,1
        6+6 = 12
        list  = 12,1
        8,2,2,4,8,16 -> 8,4,4,8,16 -> 8,8,8,16 -> 16,8,16
         */
public class ArrayListExamplesOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for list : ");
        List<Integer> list = parseNumberList(sc.nextLine());
        System.out.println("List : " + list);

        int index = 0;
        while (index < list.size() - 1) {

            int nextIndex = index + 1;
            Integer currentValue = list.get(index);
            Integer nextValue = list.get(nextIndex);

            if (currentValue == nextValue) {
                int sum = currentValue + nextValue;
                list.set(index, sum);
                list.remove(nextIndex);
                System.out.println("After one iteration : " + list);
                index = 0;
            } else {
                index++;
            }
        }
    }

    //method to convert line of integers into the list of integer
    protected static List<Integer> parseNumberList(String line) {
        String[] split = line.split(" ");
        List<Integer> intList = new ArrayList<>();
        for (String s : split) {
            intList.add(Integer.parseInt(s));
        }
        return intList;
    }
}
