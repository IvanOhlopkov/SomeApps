package practical_work;
public class Booleans {
    public void getReceipt() {
        String message = "None";
        int milkAmount = 2000; // ml
        int powderAmount = 5000; // g
        int eggsCount = 9; // items
        int sugarAmount = 50; // g
        int oilAmount = 30; // ml
        int appleCount = 8; // items

        // Example
        // apples - 5
        if (appleCount >= 5) {
            message = "Apple juice";
        }

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            message = "Pancakes";
        }

        // milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            message = "Omelette";
        }

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            message = "Apple pie";
        }
        System.out.println(message);
    }
}
