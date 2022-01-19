package serviceinterface;

import model.Book;

public interface BookDataInterface {
    public void addNewBookDetail(Book book);
    public int newBookId();
    public void showAllBookDetails();
    public void showBookDetailsByID(int id);
    public void showBookDetailsByName(String bookName);
    public boolean removeBookDetailByID(int id);
    public boolean removeBookDetailByName(String bookName);
}
