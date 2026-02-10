public class TicketContext {
    private TicketState currentState;
    private int id;
    private String channel;
    private String type;
    private String request;
    private String response;
    private String status;

    public TicketContext(int id, String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.currentState = new NewState();
        this.status = "NEW";
    }

    public void handle() {
        currentState.handle(this);
    }

    public void setState(TicketState state) {
        this.currentState = state;
        this.status = state.getStatus();
    }

    public String getStatus() { return status; }
    public int getId() { return id; }
    public String getChannel() { return channel; }
    public String getType() { return type; }
    public String getRequest() { return request; }
    public void setRequest(String request) { this.request = request; }
    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }
}