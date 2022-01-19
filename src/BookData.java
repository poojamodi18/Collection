import model.Book;

import java.util.ArrayList;

public class BookData {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    BookData(){
        Book book1 = new Book(101, "Operating System", "Galvin", "Wiley",150);
        Book book2 = new Book(102, "DCN", "Forouzan", "Mc Hill",450);
        Book book3 = new Book(103,"Data Communication","Wiley","Md Hill",350);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
    }

    public void addNewBookDetail(Book book){
        bookList.add(book);
    }

    public void showBookDetails(){
        for (Book b: bookList) {
            System.out.println(b.toString());
        }
    }
    public boolean removeBookDetail(int id){
        for (Book b: bookList) {
            if(b.getId()==id){
                bookList.remove(b);
                return true;
            }
        }
        return false;
    }
}
