package tasks;
public class PrintHouse {

    int paperReserve = 600000;
    int inkReserve = 600000;
    int coverReserve = 2000;

    double printRollerMinTemp = 80.5;
    double printRollerMaxTemp = 120.75;

    String message;

    public void showPrintHouse(){
        int pagesInBook = 530;
        int booksCount = 2000;
        boolean coldPrintingMode = false;
        double printRollerTemp = 90;
        int papersCount = booksCount * pagesInBook / 2;
        int inkedPaperCount = papersCount + booksCount;

        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIsEnough = inkedPaperCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal = printRollerMinTemp <= printRollerTemp && printRollerTemp <= printRollerMaxTemp;

        boolean errors = false;
        String errorMessage = "Ошибок нет";

        if (!paperIsEnough) {
            errors = true;
            errorMessage = "Бумаги недостаточно";
        }
        if (!inkIsEnough) {
            errors = true;
            errorMessage = "Чернил недостаточно";
        }
        if (!coldPrintingMode && !rollerTempIsNormal) {
            errors = true;
            errorMessage = "Неверный режим печати или недопустимая температура печатающего ролла";
        }

        if (!coversAreEnough) {
            errors = true;
            errorMessage = "Обложек недостаточно";
        }

        message = errors ? "Печать запрещена" + ". " + errorMessage : "Печать разрешена" + ". " + errorMessage;

        System.out.println(message);
    }

}
