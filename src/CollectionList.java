import java.util.ArrayList;
import java.util.Collections;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        list.add(1, "One");
        //Printing the arraylist object
        System.out.println(list);
        //for-each loop
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
