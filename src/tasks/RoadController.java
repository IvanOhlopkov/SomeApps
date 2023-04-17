package tasks;

import java.util.Scanner;

public class RoadController {
    private static final double passengerCarMaxWeight = 3500.0; //kg
    private static final int passengerCarMaxHeight = 2000; //mm
    private static final int controllerMaxHeight = 4000; //mm

    private static final int passengerCarPrice = 100; //RUB
    private static final int cargoCarPrice = 250; //RUB
    private static final int venichleAdditionalPrice = 200; //RUB

    public void checkRoadController() {
        System.out.println("Сколько автомобилей сгененировать?");

        int carsCount = new Scanner(System.in) .nextInt();

        for (int i = 0; i < carsCount; i++){
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial){
                System.out.println("Шлагбаум открывается... Счастливого пути!");
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }

    }
    /**
     * Расчет стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car){
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight) {
            System.out.println("Проезд невозможен: высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (carHeight > passengerCarMaxHeight) {
            double weight = car.weight;
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight) {
                price = cargoCarPrice;
                if (car.hasVenicle){
                    price = price + venichleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else {
                price = passengerCarPrice;
            }
        } else {
            price = passengerCarPrice;
        }
        return price;
    }
}
