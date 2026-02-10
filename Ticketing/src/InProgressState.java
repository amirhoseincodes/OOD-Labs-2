

public class InProgressState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        System.out.println("Working on ticket");
        context.getTypeStrategy().respond();
        context.setState(new ResolvedState());
    }

    @Override
    public String getStatus() {
        return "IN_PROGRESS";
    }
}
