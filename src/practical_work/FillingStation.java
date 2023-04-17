package practical_work;
public class FillingStation {
    public void getFuel() {
        int fuelType = 95;
        int amount = 5;

        String message = "None";
        int maxAmount = 400;

        double fuel92price = 70.3;
        double fuel95price = 76.33;
        double discount = 0.1;
        String wrongFuelTypeMessage = "Указан неверный тип топлива";
        String fuelPriceMessage;
        boolean hasDiscount = amount > 10;

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            message = wrongFuelTypeMessage;
        }

        if (amount < 1) {
            message = "Указано слишком малое количество топлива";
            amount = 0;
        }

        if (hasDiscount) {
            fuelPrice = (1 - discount) * fuelPrice;
        }

        if (amount > maxAmount) {
            message = "Указанное количество топлива превышает максимально допустимое";
        }

        fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";

        double totalPrice = fuelPrice * amount;
        message = fuelPriceMessage + "\n" + "Общая стоимость заправки: " + totalPrice + " руб.";
        System.out.println(message);
    }
}
