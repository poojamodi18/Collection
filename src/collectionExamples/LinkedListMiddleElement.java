package collectionExamples;

import java.util.LinkedList;
//get middle element of linked list in one iteration
public class LinkedListMiddleElement {
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
        System.out.println("Middle : "+names.get(names.size()/2));
    }
}
