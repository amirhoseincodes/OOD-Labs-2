

public interface TicketState {
    void handle(TicketContext context);
    String getStatus();
}
