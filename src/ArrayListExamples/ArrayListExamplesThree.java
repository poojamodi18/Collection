package ArrayListExamples;

import java.util.*;

/*
Merge two list in following order
list1[0], list2[0], list1[1], list2[1],......list1[n],list2[n]
 */
public class ArrayListExamplesThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words for first list : ");
        List<String> list1 = parseStringList(sc.nextLine());
        System.out.println(list1);
        System.out.println("Enter words for second list : ");
        List<String> list2 = parseStringList(sc.nextLine());
        System.out.println(list2);

        List<String> mergeList = new ArrayList<>();

        for (int i = 0; i < Math.max(list1.size(), list2.size()); i++) {
            if(i< list1.size()){
                mergeList.add(list1.get(i));
            }
            if(i< list2.size()){
                mergeList.add(list2.get(i));
            }
        }

        System.out.println("Merged List : "+mergeList);
    }

    //method to convert line of string into the list of string
    protected static List<String> parseStringList(String line) {
        String[] split = line.split(" ");
        //if any list is empty
        if(split.length ==1 && split[0].equalsIgnoreCase("")){
            return new ArrayList<>();
        }
        return new ArrayList<>(Arrays.asList(split));
    }
}
