

public class ClosedState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        System.out.println("Ticket closed");
    }

    @Override
    public String getStatus() {
        return "CLOSED";
    }
}
