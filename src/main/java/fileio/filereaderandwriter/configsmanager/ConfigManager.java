package fileio.filereaderandwriter.configsmanager;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ConfigManager {
    
    public void updatePortConfig(String newPort){

        List<String> lines = new ArrayList<>();
        File configFile = new File("fileio/file_reader_andwriter/configsmanager/configs/config.txt");
        if(!configFile.exists()){
            System.out.println("Config file not found.");
            return;
        }

        try(FileReader fileReader = new FileReader(configFile);
            BufferedReader reader = new BufferedReader(fileReader)){

            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            for(int i=0; i<lines.size();i++){
                if(lines.get(i).startsWith("port=")){
                    lines.set(i,"port="+newPort);
                    break;
                }
            }
        try(FileWriter writer = new FileWriter(configFile)){
            for(int j=0;j<lines.size();j++){
                writer.write(lines.get(j)+"\n");
            }
        }

        } catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }

    }

}
