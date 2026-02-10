

public class AssignedState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        context.getTypeStrategy().assign();
        context.setState(new InProgressState());
    }

    @Override
    public String getStatus() {
        return "ASSIGNED";
    }
}
