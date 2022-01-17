import pojo.Book;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "one");
        map1.put(102, "two");
        map1.put(103, "one");
        // map1.put(101, "three");
        System.out.println(map1);
        for(Map.Entry en : map1.entrySet()){
            System.out.println(en.getKey()+" "+en.getValue());
        }

        //HashMap with class object as value
        Book book1 = new Book(101, "Operating System", "Galvin", "Wiley");
        Book book2 = new Book(102, "DCN", "Forouzan", "Mc Hill");

        Map<Integer,Book> bookMap = new HashMap<>();
        bookMap.put(book1.getId(),book1);
        bookMap.put(book2.getId(),book2);
        //System.out.println(bookMap);

        for (Map.Entry book: bookMap.entrySet()) {
            System.out.println(book);
        }
    }
}
