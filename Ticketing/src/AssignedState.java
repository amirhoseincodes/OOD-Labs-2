public class AssignedState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        String type = context.getType();
        if (type.equals("BUG")) {
            System.out.println("Assigned to engineering");
        } else {
            System.out.println("Assigned to support");
        }
        context.setState(new InProgressState());
    }

    @Override
    public String getStatus() {
        return "ASSIGNED";
    }
}