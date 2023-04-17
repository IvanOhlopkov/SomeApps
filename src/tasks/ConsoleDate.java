package tasks;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleDate {
    public void getConsoleDate() {
        DateFormat format = new SimpleDateFormat("hh:mm  dd.MM.yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
