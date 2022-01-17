import pojo.Book;

import java.util.HashSet;
import java.util.Scanner;
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

        Scanner sc = new Scanner(System.in);
        Book book3 = new Book();
        book3.setId(103);
        System.out.print("Enter Book Name:");
        book3.setName(sc.nextLine());
        System.out.print("Book Author:");
        book3.setAuthor(sc.nextLine());
        System.out.print("Book Publisher:");
        book3.setPublisher(sc.nextLine());

        bookSet.add(book3);

        System.out.println(bookSet);

        for (Book book : bookSet) {

//          System.out.println(book);
            System.out.println(book.getName() + " " + book.getId());

        }
    }
}
