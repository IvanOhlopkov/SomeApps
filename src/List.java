import tasks.*;
import practical_work.*;

public class List {
    public void showApplications(){
        //TODO: нормальный список
        System.out.println("1 - Сравнение возрастов, 2 - Booleans .... и так до 21");
    }
    public void getApplication(int value) {
        switch (value) {
            case 1 -> {
                AgeComparator ageComparator = new AgeComparator();
                ageComparator.getAgeComp();
            }
            case 2 -> {
                Booleans booleans = new Booleans();
                booleans.getReceipt();
            }
            case 3 -> {
                ComputerInfo computerInfo = new ComputerInfo();
                computerInfo.getComputerInfo();
            }
            case 4 -> {
                FactorialCalculator factorialCalculator = new FactorialCalculator();
                factorialCalculator.getCalc();
            }
            case 5 -> {
                FillingStation fillingStation = new FillingStation();
                fillingStation.getFuel();
            }
            case 6 -> {
                ForCycle forCycle = new ForCycle();
                forCycle.getCycle();
            }
            case 7 -> {
                GuessTheNumber guessTheNumber = new GuessTheNumber();
                guessTheNumber.getGuess();
            }
            case 8 -> {
                SwimmingPool swimmingPool = new SwimmingPool();
                swimmingPool.calcFilling();
            }
            case 9 -> {
                CoffeeMachine coffeeMachine = new CoffeeMachine();
                coffeeMachine.takeCoffee();
            }
            case 10 -> {
                Conditions conditions = new Conditions();
                conditions.delivery();
            }
            case 11 -> {
                ConsoleDate consoleDate = new ConsoleDate();
                consoleDate.getConsoleDate();
            }
            case 12 -> {
                Cycles cycles = new Cycles();
                cycles.getSum();
            }
            case 13 -> {
                DateTime dateTime = new DateTime();
                dateTime.getDateTime();
            }
            case 14 -> {
                DayOfWeek dayOfWeek = new DayOfWeek();
                dayOfWeek.getDayOfWeek();
            }
            case 15 -> {
                ForAndWhile forAndWhile = new ForAndWhile();
                forAndWhile.getTicket();
            }
            case 16 -> {
                LeapYear leapYear = new LeapYear();
                leapYear.getLeapYear();
            }
            case 17 -> {
                PrintHouse printHouse = new PrintHouse();
                printHouse.showPrintHouse();
            }
            case 18 ->{
                RoadCamera roadCamera = new RoadCamera();
                roadCamera.checkGrade();
            }
            case  19 ->{
                SwitchCase switchCase = new SwitchCase();
                switchCase.trySwitch();
            }
            case 20 ->{
                WhileYes whileYes = new WhileYes();
                whileYes.checkYes();
            }
            case 21 ->{
                RoadController roadController = new RoadController();
                roadController.checkRoadController();
            }
        }
    }
}