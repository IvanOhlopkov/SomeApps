package tasks;
import java.util.Scanner;

public class RoadCamera {
    public void checkGrade() {
        //Parameters
        int maxOncomingSpeed = 30;
        int speedFineGrade = 20;
        int finePerGrade = 500;
        int criminalSpeed = 180;

        //==========================================
        System.out.println("Введите скорость автомобиля:");
        int oncomingSpeed = new Scanner(System.in).nextInt();

        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Вызов полиции ...");
        } else if (oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штрафа: " + fine);
        } else {
            System.out.println("Скорость не превышена");
        }
    }
}
