import model.Book;

import java.util.ArrayList;

public class BookData {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    BookData() {
        Book book1 = new Book(101, "Operating System", "Galvin", "Wiley", 150);
        Book book2 = new Book(102, "DCN", "Forouzan", "Mc Hill", 450);
        Book book3 = new Book(103, "Data Communication", "Wiley", "Md Hill", 350);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
    }

    public void addNewBookDetail(Book book) {
        bookList.add(book);
    }

    public int newBookId() {
        Book b = bookList.get(bookList.size() - 1);
        return b.getId() + 1;
    }

    public void showAllBookDetails() {
        for (Book b : bookList) {
            System.out.println(b.toString());
        }
    }

    public void showBookDetailsByID(int id) {
        for (Book b : bookList) {
            if (b.getId() == id) {
                System.out.println(b.toString());
                return;
            }
        }
        System.out.println("Book with ID " + id + " does not exist");
    }

    public void showBookDetailsByName(String bookName) {
        for (Book b : bookList) {
            if (b.getName().equalsIgnoreCase(bookName)) {
                System.out.println(b.toString());
                return;
            }
        }
        System.out.println("Book with name " + bookName + " does not exist");
    }

    public boolean removeBookDetailByID(int id) {
        for (Book b : bookList) {
            if (b.getId() == id) {
                bookList.remove(b);
                return true;
            }
        }
        return false;
    }

    public boolean removeBookDetailByName(String bookName) {
        for (Book b : bookList) {
            if (b.getName().equalsIgnoreCase(bookName)) {
                bookList.remove(b);
                return true;
            }
        }
        return false;
    }
}
