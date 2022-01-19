public class BookDemo {
    public static void main(String[] args) {
        BookData bookData = new BookData();
        bookData.showBookDetails();
        if(bookData.removeBookDetail(102)){
            System.out.println("Book Detail Removed Successfully");
            bookData.showBookDetails();
        }
    }
}
