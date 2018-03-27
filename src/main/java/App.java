public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;




    public void setClient(Client client) {
        this.client = client;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }


    public static void main(String[] args) {
        App app = new App();
        app.client = new Client("1", "John Smith");
        app.eventLogger = new ConsoleEventLogger();
        app.logEvent("Some event for user 1");
    }


}