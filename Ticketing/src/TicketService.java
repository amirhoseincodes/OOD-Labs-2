public class TicketService {
    public void handle(TicketContext ticket) {
        ticket.handle();
        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}
