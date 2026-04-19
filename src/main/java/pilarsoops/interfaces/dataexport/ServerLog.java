package interfaces.dataexport;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerLog implements Exportable {

    private LocalDateTime timestamp;
    private String event;
    private static final DateTimeFormatter formatBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public ServerLog(LocalDateTime timestamp, String event) {
        this.timestamp = timestamp;
        this.event = event;
    }

    @Override
    public String exportData(){
        return "\nServer Log\n"+timestamp.format(formatBr) + "," + event;
    }

    @Override
    public String toString() {
        return "ServerLog [timestamp=" + timestamp + ", event=" + event + "]";
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    
    
}
