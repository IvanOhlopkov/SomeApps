package practical_work;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public void getGuess() {
        int attempt = -1;
        int value = new Random().nextInt(100);

        System.out.println("Введите число");

        while (attempt != value) {
            attempt = new Scanner(System.in).nextInt();
            if (attempt < value) {
                System.out.println("Загаданное число больше");
            } else if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Вы угадали!");
            }
        }
    }
}
