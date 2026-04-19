package collectionsframework.lists.securityalertfilter;

public class SecurityAlert {
    
    private String message;
    private String severity;

    public SecurityAlert(String message, String severity) {
        this.message = message;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "SecurityAlert [message=" + message + ", severity=" + severity + "]";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    

}
