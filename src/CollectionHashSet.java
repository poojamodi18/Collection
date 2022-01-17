import pojo.Book;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("one");
        System.out.println(set1);

        //Hashset with class object as value
        Book book1 = new Book(101, "Operating System", "Galvin", "Wiley");
        Book book2 = new Book(102, "DCN", "Forouzan", "Mc Hill");

        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(book1);
        bookSet.add(book2);

        System.out.println(bookSet);

        for (Book book : bookSet) {

//            System.out.println(book);
            System.out.println(book.getName() + " " + book.getId());


        }
    }
}
