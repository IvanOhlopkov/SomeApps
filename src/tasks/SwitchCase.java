package tasks;

import java.util.Scanner;

public class SwitchCase {
    public void trySwitch () {
        while (true) {
            System.out.println("Введите сообщение");
            String input = new Scanner(System.in).nextLine();

//            if (input.equals("Привет!")){
//                System.out.println("Привет!)");
//            } else if (input.equals("Как дела?")){
//                System.out.println("Отлично! У тебя как?");
//            } else {
//                System.out.println("Не понимаю сообщение :(");
//            }

            switch (input) {
                case "Привет!" -> System.out.println("Привет!)");
                case "Как дела?" -> {
                    System.out.println("Отлично!)");
                    System.out.println("У тебя как?");
                }
                case "Хорошо!" -> System.out.println("Это же прекрасно!)");
                default -> System.out.println("Не понимаю сообщение :(");
            }
        }
    }
}
