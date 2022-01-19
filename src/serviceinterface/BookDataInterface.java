package serviceinterface;

import model.Book;

public interface BookDataInterface {
    void addNewBookDetail(Book book);
    int newBookId();
    void showAllBookDetails();
    void showBookDetailsByID(int id);
    void showBookDetailsByName(String bookName);
    boolean removeBookDetailByID(int id);
    boolean removeBookDetailByName(String bookName);
}
