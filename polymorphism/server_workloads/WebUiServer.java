package polymorphism.server_workloads;

public class WebUiServer extends Server {

    public WebUiServer(String hostName) {
        super(hostName);
    }
    
    public String processData(){
        return "Rendering HTML/CSS and serving web pages on "+hostName;
    }

    @Override
    public String toString() {
        return "WebUiServer []";
    }

    

}
