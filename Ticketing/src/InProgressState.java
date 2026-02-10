public class InProgressState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        System.out.println("Working on ticket");
        String type = context.getType();
        if (type.equals("BUG")) {
            System.out.println("Sending bug response");
        } else {
            System.out.println("Sending generic response");
        }
        context.setState(new ResolvedState());
    }

    @Override
    public String getStatus() {
        return "IN_PROGRESS";
    }
}