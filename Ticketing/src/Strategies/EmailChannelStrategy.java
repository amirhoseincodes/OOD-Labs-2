package Strategies;

public class EmailChannelStrategy implements TicketChannelStrategy {
    @Override
    public void receive() {
        System.out.println("Received from email");
    }
}
