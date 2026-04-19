package fileio.filereaderandwriter.backupsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BackupService {
    public void createBackup(String sourcePath, String destinationPath){
        File sourceFile = new File(sourcePath);
        if(!sourceFile.exists()){
            System.out.println("Error: Origin file not found.");
            return;
        }
        File destinationFolder = new File(destinationPath);
        if(!destinationFolder.exists()){
            destinationFolder.mkdirs();
            System.out.println("Folder destination created with sucess.");
        }
        File backupFile = new File(destinationFolder, "BackupFile.txt");
        try(BufferedReader originalFileReader = new BufferedReader(new FileReader(sourceFile));
            FileWriter writerBackup = new FileWriter(backupFile)){
                String originalLine = originalFileReader.readLine();
                 if(originalLine == null){
                    System.out.println("The file is empty, nothing was written in the backup file.");
                    return;
                } else System.out.println("Backup file created with sucess!");
                while (originalLine != null) {
                    writerBackup.write(originalLine+"\n");
                    originalLine = originalFileReader.readLine();
                }

            } catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
    }

}
