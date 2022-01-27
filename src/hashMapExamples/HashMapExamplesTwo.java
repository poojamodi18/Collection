package hashMapExamples;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Count numbers
Read a list of numbers and print them in ascending order along with their number of occurrences
8 2 2 8 2
2 -> 3
8 -> 2
 */
public class HashMapExamplesTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        Map<Integer, Integer> number = new TreeMap<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            if(number.containsKey(num)){
                number.put(num,(number.get(num)+1));
            }else{
                number.put(num,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : number.entrySet()) {
            System.out.println(entry.getKey()+" ->"+entry.getValue());
        }
    }
}
