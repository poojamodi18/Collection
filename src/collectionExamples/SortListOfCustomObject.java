package collectionExamples;

import model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfCustomObject {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book(101, "Operating System", "Galvin", "Wiley",300);
        Book book2 = new Book(102, "Data Communication", "Forouzan", "Mc Hill",450);
        Book book3 = new Book(103, "Operating System", "J Galvin", "Wiley",200);
        Book book4 = new Book(104, "DCN", "Forouzan. E", "Mc Hill",500);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.sort((b1,b2)->b1.getAuthor().compareTo(b2.getAuthor()));
//        bookList.sort(Comparator.comparing(Book::getAuthor));
        for (Book book : bookList) {
            System.out.println(book.getAuthor());
        }

        /*System.out.println("Sorted by author name");
        List<Book> books = new ArrayList<>(bookList.stream()
                .sorted((b1,b2)->b1.getAuthor().compareTo(b2.getAuthor()))
                .collect(Collectors.toList()));
        for (Book book : books) {
       //     System.out.println(book.getAuthor());
        }*/
    }
}
