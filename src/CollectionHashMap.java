import model.Book;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "one");
        map1.put(102, "two");
        map1.put(103, "one");
        // map1.put(101, "three");
        System.out.println(map1);
        for (Map.Entry en : map1.entrySet()) {
            System.out.println(en.getKey() + " " + en.getValue());
        }

        //HashMap with class object as value
        Book book1 = new Book(101, "Operating System", "Galvin", "Wiley",150);
        Book book2 = new Book(102, "DCN", "Forouzan", "Mc Hill",450);

        Map<Integer, Book> bookMap = new HashMap<>();
        bookMap.put(book1.getId(), book1);
        bookMap.put(book2.getId(), book2);
        //System.out.println(bookMap);
        Book b1 = bookMap.get(book1.getId());
        b1.setName("OS");

        for (Map.Entry<Integer, Book> book : bookMap.entrySet()) {
            Book b = book.getValue();
            System.out.println(b.getName());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Book ID: ");
        Integer key = sc.nextInt();
        //if a map contains a mapping for the specified key.
        if (bookMap.containsKey(key)) {
            System.out.println(bookMap.get(key));
        } else {
            System.out.println("NO!");
        }

        System.out.println("Linked HashMap");
        Map<Integer, Book> linkBook = new LinkedHashMap<>();
        linkBook.putAll(bookMap);
        for (Map.Entry<Integer, Book> book : linkBook.entrySet()
        ) {
            System.out.println(book);
        }
    }
}
