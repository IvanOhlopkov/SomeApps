package tasks;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public void getDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM:ss dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}
