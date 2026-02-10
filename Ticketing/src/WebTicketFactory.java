import Strategies.WebChannelStrategy;

public class WebTicketFactory extends TicketFactory {
    @Override
    public TicketContext createTicket(int id, String channel, String type) {
        TicketContext ticket = new TicketContext(
            id,
            channel,
            type,
            new WebChannelStrategy(),
            createTypeStrategy(type)
        );
        ticket.setState(new NewState());
        System.out.println("Logging ticket creation : " + ticket.getId() + " -> " + ticket.getStatus());
        return ticket;
    }
}
