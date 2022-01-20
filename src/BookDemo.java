import model.Book;
import serviceinterface.impl.BookData;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        BookData bookData = new BookData();

        boolean exit = true;
        do {
            System.out.println();
            System.out.println("1 - Show All Book Details");
            System.out.println("2 - Show One Book details");
            System.out.println("3 - Add New Book");
            System.out.println("4 - Remove Book");
            System.out.println("5 - Exit");
            System.out.print("Choice: ");
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookData.showAllBookDetails();
                    break;
                case 2:
                    System.out.println("1 - Show book details by id");
                    System.out.println("2 - Show book details by name");
                    System.out.println("3 - Main Menu");
                    System.out.print("Choice: ");
                    int showChoice = sc.nextInt();
                    switch (showChoice) {
                        case 1:
                            System.out.print("Enter Book ID: ");
                            int bookID = sc.nextInt();
                            bookData.showBookDetailsByID(bookID);
                            break;
                        case 2:
                            System.out.print("Enter Book Name: ");
                            String bookName = sc.next();
                            bookData.showBookDetailsByName(bookName);
                            break;
                        case 3:
                            continue;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 3:
                    Book newBook = new Book();
                    System.out.print("Enter Book Name:");
                    newBook.setName(sc.next());
                    System.out.print("Book Author:");
                    newBook.setAuthor(sc.next());
                    System.out.print("Book Publisher:");
                    newBook.setPublisher(sc.next());
                    System.out.print("Book Price:");
                    newBook.setPrice(sc.nextInt());
                    newBook.setId(bookData.newBookId());
                    bookData.addNewBookDetail(newBook);
                    break;
                case 4:
                    System.out.println("1 - Remove book by id");
                    System.out.println("2 - Remove book by name");
                    System.out.println("3 - Main Menu");
                    System.out.print("Choice: ");
                    int removeChoice = sc.nextInt();
                    switch (removeChoice) {
                        case 1:
                            System.out.print("Enter Book ID: ");
                            int bookID = sc.nextInt();
                            if (bookData.removeBookDetailByID(bookID)) {
                                System.out.println("Book with ID " + bookID + " removed");
                            } else {
                                System.out.println("Book with ID " + bookID + " does not exist");
                            }
                            break;
                        case 2:
                            System.out.print("Enter Book Name: ");
                            String bookName = sc.next();
                            if(bookData.removeBookDetailByName(bookName)){
                                System.out.println("Book with name " + bookName + " removed");
                            }else {
                                System.out.println("Book with name " + bookName + " does not exist");
                            }
                            break;
                        case 3:
                            continue;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (exit);
    }
}
