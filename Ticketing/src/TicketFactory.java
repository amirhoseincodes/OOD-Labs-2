
import Strategies.BugTypeStrategy;
import Strategies.GenericTypeStrategy;
// import Strategies.TicketChannelStrategy;
import Strategies.TicketTypeStrategy;

public abstract class TicketFactory {
    public abstract TicketContext createTicket(int id, String channel, String type);

    protected TicketTypeStrategy createTypeStrategy(String type) {
        if ("BUG".equals(type)) {
            return new BugTypeStrategy();
        }
        return new GenericTypeStrategy();
    }
}
