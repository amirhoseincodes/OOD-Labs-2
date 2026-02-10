package Strategies;

public class GenericTypeStrategy implements TicketTypeStrategy {
    @Override
    public void assign() {
        System.out.println("Assigned to support");
    }

    @Override
    public void respond() {
        System.out.println("Sending generic response");
    }
}
