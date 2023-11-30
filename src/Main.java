//------------💪 Java Date and Time 💪-----------------------
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTimeObject = LocalDateTime.now();
        System.out.println("Before formatting: "  + localDateTimeObject);
        DateTimeFormatter dataTimeFormatterObject = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        String afterFormatting = localDateTimeObject.format(dataTimeFormatterObject);
        System.out.println("After formatting: " + afterFormatting);
    }
}




