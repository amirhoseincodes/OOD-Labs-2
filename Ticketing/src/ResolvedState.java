public class ResolvedState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        System.out.println("Ticket resolved");
        context.setState(new ClosedState());
    }

    @Override
    public String getStatus() {
        return "RESOLVED";
    }
}