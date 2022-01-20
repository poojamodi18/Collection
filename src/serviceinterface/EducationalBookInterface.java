package serviceinterface;

import model.EducationalBook;

public interface EducationalBookInterface {
    int SHOW_ALL = 1;
    int SHOW_NAME = 2;
    void showBookDetail(EducationalBook educationalBook,int mode);
}
