package tasks;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVenicle;
    public boolean isSpecial;

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return  "\n========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}
