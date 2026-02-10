package Strategies;

public class WebChannelStrategy implements TicketChannelStrategy {
    @Override
    public void receive() {
        System.out.println("Received from web");
    }
}
