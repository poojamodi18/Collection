import model.EducationalBook;

public class EducationBookDemo {
    public static void main(String[] args) {
        EducationalBook educational = new EducationalBook();
        EducationalBook educationalBook = new EducationalBook(101, "Complete Java Reference", "Herbert",
                "McGraw Hill", 540, "Textbook", "Java");
        System.out.println(educationalBook.toString());
        //access super class method by using subclass's object
        System.out.println("Book Name: "+educationalBook.getName());
    }
}
