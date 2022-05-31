package collectionExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {
        String[] person = {"Joon","Jin","Yoon"};
        LinkedList<String> names = new LinkedList<>(Arrays.asList(person));
        System.out.println(names);
        names.add("Hope");
        names.add("Min");
        names.add("Tae");
        names.add("Jeon");

        System.out.println("list : "+names);

        String[] name = names.toArray(new String[0]);
        for (String s : name) {
            System.out.print(s+ " ");
        }
    }
}
