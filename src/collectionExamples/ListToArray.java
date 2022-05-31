package collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        String[] array = {"Joon","Jin","Yoon"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.add("Hope");
        list.add("Min");
        list.add("Tae");
        list.add("Jeon");

        System.out.println("List : "+list);

        String[] strArray = list.toArray(new String[list.size()]);
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
