package collectionExamples;

import java.util.LinkedList;

//use add addFirst and addLast with linked list
public class LinkListAddMethods {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Jin");
        linked.add("Yoon");
        System.out.println(linked);
        linked.addFirst("Joon");
        System.out.println(linked);
        linked.add("Hope");
        linked.addLast("Min");
        System.out.println(linked);
    }
}
