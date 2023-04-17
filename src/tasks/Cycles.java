package tasks;

import java.util.Scanner;

public class Cycles {
    public void ageCheck() {
        for (int i = 0; i <= 40; i = i + 1) {
            System.out.println(i);

            if (i == 16) {
                System.out.println("Вы можете начать обучаться вождению");
            }

            if (i == 18) {
                System.out.println("Вы можете получить водительские права");
            }

            if (i == 35) {
                System.out.println("Вы можете баллотироваться на пост президента");
            }
        }
    }
    public void getSum() {
        int sum = 0;

        System.out.println("Введите число и нажмите <Enter>:");

        while (true) {
            int value = new Scanner(System.in).nextInt();
            sum = sum + value;
            System.out.println("Сумма: " + sum);
            System.out.println("Введите еще одно число или 0 для сброса суммы:");
            if (value == 0) {
                sum = 0;
                System.out.println("Сумма сброшена. Введите новое число: ");
            }
        }
    }
}
