import java.io.IOException;
import java.util.Scanner;

public class SelectTask {
    public static void main(String[] args){

        List list = new List();

        System.out.println("Список приложений:");
        list.showApplications();

        System.out.println("Введите номер приложения:");
        int value = new Scanner(System.in).nextInt();

        list.getApplication(value);


    }
}
