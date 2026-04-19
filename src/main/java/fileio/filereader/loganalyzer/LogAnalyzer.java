package fileio.filereader.loganalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {
    
    public void findErrors(){
        File logFile = new File("fileio/filereader/loganalyzer/logs/exemple_errorlogs.txt");
        if(!logFile.exists()){
            System.out.println("No logs founds.");
            return;
        }
        try(FileReader fileReader = new FileReader(logFile);
            BufferedReader reader = new BufferedReader(fileReader)){
            
                String line = reader.readLine();
                while (line != null) {
                    if(line.contains("ERROR") || line.contains("Error")){
                        System.out.println(line);
                    }
                    line = reader.readLine();
                }
        } catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
