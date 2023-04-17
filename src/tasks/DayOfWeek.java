package tasks;

import java.util.Scanner;

public class DayOfWeek {
    public void getDayOfWeek() {
        System.out.println("Введите день недели:");
        String dayOfWeek = new Scanner(System.in).nextLine();

        String message = switch (dayOfWeek) {
            case "Понедельник", "Вторник", "Четверг" -> "Работа.";
            case "Среда" -> "Зенит рабочей недели.Очень много работы.";
            case "Пятница" -> "Последний рабочий день перед выходными.";
            case "Суббота" -> "Ура, первый выходной! Можно и поспать.";
            case "Воскресенье" -> "Остался последний выходной, пора готовиться к работе. Но можно и поспать :)";

            default -> "Не знаю такого дня, но я бы поспал";
        };
        System.out.println(message);
    }
}
