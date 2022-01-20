package model;

public class EducationalBook extends Book {
    private String category;
    private String subject;

    public EducationalBook() {
    }

    public EducationalBook(int id, String name, String author, String publisher, int price, String category, String subject) {
        super(id, name, author, publisher, price);
        this.category = category;
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "EducationalBook{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", publisher='" + super.getPublisher() + '\'' +
                ", price=" + super.getPrice() +
                "category='" + category + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
