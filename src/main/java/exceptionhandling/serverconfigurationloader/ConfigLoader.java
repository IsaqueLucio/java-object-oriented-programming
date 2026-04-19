package exceptionhandling.serverconfigurationloader;

public class ConfigLoader {
 
    public void loadConfig(String filePath) throws Exception{

        if("serverconfig.ini".equals(filePath)){
            System.out.println("Configuration loaded successfully. Server starting...");
        } else{
            throw new Exception("File Not Found: The configuration file is missing.");
        }
    }

}
