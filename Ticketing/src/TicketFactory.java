
import Strategies.BugTypeStrategy;
import Strategies.EmailChannelStrategy;
import Strategies.GenericTypeStrategy;
import Strategies.TicketChannelStrategy;
import Strategies.TicketTypeStrategy;
import Strategies.WebChannelStrategy;

public class TicketFactory {
    public static TicketContext create(int id, String channel, String type) {
        return new TicketContext(
            id,
            channel,
            type,
            createChannelStrategy(channel),
            createTypeStrategy(type)
        );
    }

    static TicketChannelStrategy createChannelStrategy(String channel) {
        if ("EMAIL".equals(channel)) {
            return new EmailChannelStrategy();
        }
        return new WebChannelStrategy();
    }

    static TicketTypeStrategy createTypeStrategy(String type) {
        if ("BUG".equals(type)) {
            return new BugTypeStrategy();
        }
        return new GenericTypeStrategy();
    }
}
