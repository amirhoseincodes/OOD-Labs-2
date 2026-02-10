
import Strategies.TicketChannelStrategy;
import Strategies.TicketTypeStrategy;

public class TicketContext {
    private TicketState currentState;
    private int id;
    private String channel;
    private String type;
    private String request;
    private String response;
    private String status;
    private TicketChannelStrategy channelStrategy;
    private TicketTypeStrategy typeStrategy;

    public TicketContext(int id, String channel, String type, TicketChannelStrategy channelStrategy, TicketTypeStrategy typeStrategy) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.channelStrategy = channelStrategy;
        this.typeStrategy = typeStrategy;
        this.currentState = new NewState();
        this.status = "NEW";
    }

    public TicketContext(int id, String channel, String type) {
        this(
            id,
            channel,
            type,
            TicketFactory.createChannelStrategy(channel),
            TicketFactory.createTypeStrategy(type)
        );
    }

    public void handle() {
        currentState.handle(this);
    }

    public void setState(TicketState state) {
        this.currentState = state;
        this.status = state.getStatus();
    }

    public TicketChannelStrategy getChannelStrategy() { return channelStrategy; }
    public TicketTypeStrategy getTypeStrategy() { return typeStrategy; }

    public String getStatus() { return status; }
    public int getId() { return id; }
    public String getChannel() { return channel; }
    public String getType() { return type; }
    public String getRequest() { return request; }
    public void setRequest(String request) { this.request = request; }
    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }
}
