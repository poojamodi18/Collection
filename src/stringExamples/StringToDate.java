package stringExamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) {
        String dataStr = "03-02-2022";
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(dataStr,dateFormat);
        System.out.println(date);

        String today = date.toString();
        System.out.println(today);

        dataStr = "2022-02-04";
        LocalDate date1 = LocalDate.parse(dataStr,DateTimeFormatter.ISO_DATE);
        System.out.println(date1);
        DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("MMM dd,yyyy");
        System.out.println(date1.format(dateFormat1));



    }
}
