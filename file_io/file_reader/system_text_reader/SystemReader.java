package file_io.file_reader.system_text_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SystemReader {
    
    public void readLogs(){
        File logFile = new File("file_io/file_writer/system_text_logger/logs/system_logs.txt");
        if(!logFile.exists()){
            System.out.println("No logs found.");
            return;
        }
        try(FileReader fileReader = new FileReader(logFile);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
