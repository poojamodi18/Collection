package collectionExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListElements {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Joon");
        names.add("Jin");
        names.add("Yoon");
        names.add("Hope");
        names.add("Min");
        names.add("Tae");
        names.add("Jeon");

        System.out.println("list : "+names);

        System.out.println(names.get(4));

        names.add(3,"Jang");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        names.remove("Jang");
        System.out.println();
        for (String name : names) {
            System.out.print(name+" ");
        }
        names.clear();
        System.out.println("\nList "+names);
    }
}
