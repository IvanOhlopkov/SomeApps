package practical_work;
import java.util.Scanner;

public class FactorialCalculator {
    public void getCalc() {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();
        int sum = 1;

        for (int i = 1; i <= value; i = i + 1) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
