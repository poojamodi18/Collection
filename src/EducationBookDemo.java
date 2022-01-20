import model.EducationalBook;
import serviceinterface.EducationalBookInterface;
import serviceinterface.impl.EducationalBookData;

public class EducationBookDemo {
    public static void main(String[] args) {
        /*EducationalBook educational = new EducationalBook();
        EducationalBook educationalBook = new EducationalBook(101, "Complete Java Reference", "Herbert",
                "McGraw Hill", 540, "Textbook", "Java");
        System.out.println(educationalBook.toString());
        //access super class method by using subclass's object
        System.out.println("Book Name: "+educationalBook.getName());*/

        EducationalBookInterface educationalBook = new EducationalBookData();
        EducationalBook book = new EducationalBook(101, "Complete Java Reference", "Herbert",
                "McGraw Hill", 540, "Textbook", "Java");

        educationalBook.showBookDetail(book,EducationalBookInterface.SHOW_ALL);
        educationalBook.showBookDetail(book,EducationalBookInterface.SHOW_NAME);

    }
}
