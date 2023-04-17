package practical_work;
import java.util.Scanner;

public class ForCycle {
    public void getCycle() {
        int value = new Scanner(System.in).nextInt();
        int sum;

        for (int i = 1; i <= value; i++) {
            for (int c = 1; c <= value; c++) {
                sum = i * c;
                if (sum == value) {
                    System.out.println(i + "*" + c);
                }
            }
        }
    }
}
