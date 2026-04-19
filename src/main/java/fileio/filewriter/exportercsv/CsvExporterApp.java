package fileio.filewriter.exportercsv;

import java.util.ArrayList;
import java.util.List;

public class CsvExporterApp {
    public static void main(String[] args) {
        
        List<String> testUsers = new ArrayList<>();
        CsvExporter csvExporter = new CsvExporter();

        testUsers.add("Ana");
        testUsers.add("Rafela");
        testUsers.add("Nikolas");
        testUsers.add("Lucas");
        testUsers.add("Yasmin");
        testUsers.add("Giulia");

        csvExporter.exportUsers(testUsers);
        

    }
}
