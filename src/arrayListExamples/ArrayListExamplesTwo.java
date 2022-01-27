package arrayListExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Sum all the number in list in following order
first+last , second+second-last , third+third-last ....
 */
public class ArrayListExamplesTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for list : ");
        List<Integer> list = parseNumberList(sc.nextLine());
        System.out.println("List : " + list);

        int index = 0;
        while (index <= (list.size() / 2)) {
            int secondIndex = (list.size() - 1);
            System.out.println(index);
            System.out.println(secondIndex);
            int sum = list.get(index) + list.get(secondIndex);
            list.set(index, sum);
            list.remove(secondIndex);
            System.out.println("After one iteration : " + list);
            index++;

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
