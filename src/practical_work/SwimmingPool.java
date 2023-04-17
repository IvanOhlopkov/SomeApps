package practical_work;

public class SwimmingPool {
    public void calcFilling() {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;

        int currentVolume = 0;
        int timeFilling = 0; //minute

        while (currentVolume < volume) {

            timeFilling = timeFilling + 1;
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            if (currentVolume >= volume) {
                break;
            }

        }
        System.out.println("Время заполнения бассейна: " + timeFilling);
    }
}
