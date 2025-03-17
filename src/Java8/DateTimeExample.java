package Java8;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // ngay hien tai
        LocalTime time = LocalTime.now(); // gio hien tai
        LocalDateTime dateTime = LocalDateTime.now(); // ngay gio hien tai
        // dinh dang ngay gio
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);


        System.out.println("ngay hien tai la :" + date);
        System.out.println("thoi gian hien tai la : " + time);
        System.out.println("ngay gio hien tai la " + dateTime);
        System.out.println(" sau khi dinh dang ngay gio : " + formattedDate);
    }
}
