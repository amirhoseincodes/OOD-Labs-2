public class Main {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();

        TicketContext ticket = new TicketContext(3, "EMAIL", "BUG");
        ticket.setRequest("I see a very very BAD BUG!");

        for (int i = 0; i < 5; i++) {
            ticketService.handle(ticket);
        }
    }
}