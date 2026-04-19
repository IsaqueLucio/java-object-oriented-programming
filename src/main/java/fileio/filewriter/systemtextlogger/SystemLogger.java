package fileio.filewriter.systemtextlogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SystemLogger {
    
    public void createLog(String message){   
        File folder = new File("fileio/filewriter/system_textlogger/logs");
        if(!folder.exists()){
            folder.mkdirs();
            System.out.println("Folder 'logs' created with success.");
        }

        File logFile = new File(folder, "systemlogs.txt");

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
