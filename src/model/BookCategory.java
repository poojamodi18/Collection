package model;

public enum BookCategory {
    TEXTBOOK("Textbook"),
    REFERENCE_BOOK("Reference Book");

    private final String bookCategory;

    BookCategory(String s) {
        this.bookCategory = s;
    }
    public String getBookCategory(){
        return this.bookCategory;
    }
}
