package fileio.filewriter.exportercsv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvExporter {

    public void exportUsers(List<String> users){
        //declaring the variable with the folder location
        File folder = new File("src/main/java/fileio/filewriter/exportercsv/databasecsv");
        //if the destination folder does not exist
         if(!folder.exists()){
            //then the folder is created
            folder.mkdirs();
            System.out.println("Folder 'databasecsv' created with success.");
        }
        //declaring that the file to be saved on the hard drive will be located at the folder variable location and its name will be users.csv
        File csvFile = new File(folder,"users.csv");
        //now it will try to create the variable that will be responsible for writing to the file, which is why the file is passed as a parameter
        try{
            FileWriter writer = new FileWriter(csvFile);
            //now I use the write method of the writer variable and pass the header that will be present in the file
            writer.write("ID, NOME\n");
           for(int i=0;i<users.size();i++){
            //for each user in the list, the index i becomes the ID and the user's name does not change
                writer.write(i+","+users.get(i)+"\n");
            }
            //closing to avoid issues
            writer.close();
            //if there is an error, it catches this error 
        } catch(IOException e){
            //and transforms it into a more readable message
            System.out.println("Error: "+e.getMessage());
        }

        
    }
}
