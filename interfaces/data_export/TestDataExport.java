package interfaces.data_export;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestDataExport {

    public static void main(String[] args) {
        
        List <Exportable> listExportables = new ArrayList<>();

        LocalDateTime timestamp = LocalDateTime.now();
        ServerLog serverLog = new ServerLog(timestamp,  "Lola-Paluza");
        DatabaseRecord databaseRecord = new DatabaseRecord(234, "Connection failed");

        listExportables.add(serverLog);
        listExportables.add(databaseRecord);

        for(Exportable f: listExportables){
            System.out.println(f.exportData());
        }

    }
    
}
