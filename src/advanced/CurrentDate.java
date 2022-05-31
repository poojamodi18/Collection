package advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//get current date and time using local date
public class CurrentDate {
    public static void main(String[] args) {
        //date
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        //date and time with pattern
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/YY HH:mm:ss.SSS");
        System.out.println(dateTime.format(dateTimeFormatter));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        System.out.println(dateTime.format(formatter));
    }
}
