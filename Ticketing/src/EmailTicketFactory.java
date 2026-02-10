import Strategies.EmailChannelStrategy;

public class EmailTicketFactory extends TicketFactory {
    @Override
    public TicketContext createTicket(int id, String channel, String type) {
        TicketContext ticket = new TicketContext(
            id,
            channel,
            type,
            new EmailChannelStrategy(),
            createTypeStrategy(type)
        );
        ticket.setState(new NewState());
        System.out.println("Logging ticket creation : " + ticket.getId() + " -> " + ticket.getStatus());
        return ticket;
    }
}
