package fileio.filereaderandwriter.backupsystem;

public class BackupApp {
    public static void main(String[] args) {
        
        BackupService backupService = new BackupService();

        String sourcePath = "src/main/java/fileio/filereaderandwriter/backupsystem/originalfillelocation/OriginalFile.txt";
        String destinationPath = "src/main/java/fileio/filereaderandwriter/backupsystem/backupdestination";

        backupService.createBackup(sourcePath, destinationPath);

    }
}
