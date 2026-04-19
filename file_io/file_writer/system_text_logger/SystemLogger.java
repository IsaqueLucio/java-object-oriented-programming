package file_io.file_writer.system_text_logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SystemLogger {
    
    public void createLog(String message){   
        File folder = new File("file_io/file_writer/system_text_logger/logs");
        if(!folder.exists()){
            folder.mkdirs();
            System.out.println("Folder 'logs' created with success.");
        }

        File logFile = new File(folder, "system_logs.txt");

        try{
            FileWriter writer = new FileWriter(logFile, true);
            writer.write(message+"\n");
            writer.close();
            System.out.println("Sucess\nLog saved in the way: "+logFile.getAbsolutePath()+"\n");
        } catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }

    }

}
