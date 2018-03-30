import java.util.List;

public class CombinedEventLogger implements EventLogger {
    private final List<EventLogger> eventLoggers;

    public CombinedEventLogger(List<EventLogger> eventLoggers) {
        this.eventLoggers = eventLoggers;
    }


    public void logEvent(Event event) {
        for (EventLogger eventLogger : eventLoggers) {
            eventLogger.logEvent(event);
        }

    }
}
