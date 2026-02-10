public class NewState implements TicketState {
    @Override
    public void handle(TicketContext context) {
        System.out.println("Ticket created");
        String channel = context.getChannel();
        if (channel.equals("WEB")) {
            System.out.println("Received from web");
        } else if (channel.equals("EMAIL")) {
            System.out.println("Received from email");
        }
        context.setState(new AssignedState());
    }

    @Override
    public String getStatus() {
        return "NEW";
    }
}