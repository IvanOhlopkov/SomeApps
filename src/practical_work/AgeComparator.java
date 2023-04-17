package practical_work;

import java.util.Scanner;

public class AgeComparator {
    public void getAgeComp() {
        System.out.println("Введите возраст Васи:");
        int vasyaAge = new Scanner(System.in).nextInt();
        System.out.println("Введите возраст Кати:");
        int katyaAge = new Scanner(System.in).nextInt();
        System.out.println("Введите возраст Миши:");
        int mishaAge = new Scanner(System.in).nextInt();

        int min = -1; //минимальный возраст
        int middle = -1; //средний возраст
        int max = -1; //максимальный возраст

        String minAgeMessage = "Минимальный возраст: ";

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        }

        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        }

        if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        }

        if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        }

        if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge <= mishaAge) {
            middle = vasyaAge;
        }

        if (katyaAge >= vasyaAge && katyaAge <= mishaAge) {
            middle = katyaAge;
        }

        if (mishaAge >= vasyaAge && mishaAge <= katyaAge) {
            middle = mishaAge;
        }

        System.out.println("Минимальный возраст: " + min);
        System.out.println("Средний возраст: " + middle);
        System.out.println("Максимальный возраст: " + max);

    }
}
