package tasks;

public class ForAndWhile {
    public void getTicket() {
        int ticketNum = -1;
        for (int i = 200000; i <= 235000; i++) {
            ticketNum = i;
            if (ticketNum >= 200000 && ticketNum <= 210000) {
                System.out.println("Номер билета: " + ticketNum);
            }
            if (ticketNum >= 220000 && ticketNum <= 235000) {
                System.out.println("Номер билета: " + ticketNum);
            }
        }
        System.out.println("==============================");
        ticketNum = 200000;
        while (ticketNum >= 200000 && ticketNum <= 235000) {
            if (ticketNum >= 200000 && ticketNum <= 210000) {
                System.out.println("Ticket number: " + ticketNum);
            }
            if (ticketNum >= 220000 && ticketNum <= 235000) {
                System.out.println("Ticket number: " + ticketNum);
            }
            ticketNum++;
        }
    }
}