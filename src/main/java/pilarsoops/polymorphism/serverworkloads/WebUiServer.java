package polymorphism.serverworkloads;

public class WebUiServer extends Server {

    public WebUiServer(String hostName) {
        super(hostName);
    }
    
    @Override
    public String processData(){
        return "Rendering HTML/CSS and serving web pages on "+hostName;
    }

    @Override
    public String toString() {
        return "WebUiServer []";
    }

    

}
