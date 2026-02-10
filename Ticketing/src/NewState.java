

public class NewState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        System.out.println("Ticket created");
        context.getChannelStrategy().receive();
        context.setState(new AssignedState());
    }

    @Override
    public String getStatus() {
        return "NEW";
    }
}
