package serviceinterface.impl;

import model.EducationalBook;
import serviceinterface.EducationalBookInterface;

public class EducationalBookData implements EducationalBookInterface {

    @Override
    public void showBookDetail(EducationalBook educationalBook,int mode) {
        if(mode==SHOW_ALL) {
            System.out.println("Educational Book Details");
            System.out.println("Name : " + educationalBook.getName());
            System.out.println("Author : " + educationalBook.getAuthor());
            System.out.println("Subject : " + educationalBook.getSubject());
            System.out.println("Category : " + educationalBook.getCategory());
        }
        else if(mode==SHOW_NAME){
            System.out.println("Book Name : "+educationalBook.getName());
        }
    }
}
