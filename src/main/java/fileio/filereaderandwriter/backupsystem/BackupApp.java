package fileio.filereaderandwriter.backupsystem;

public class BackupApp {
    public static void main(String[] args) {
        
        BackupService backupService = new BackupService();

        String sourcePath = "fileio/file_reader_andwriter/backupsystem/original_fillelocation/OriginalFile.txt";
        String destinationPath = "fileio/file_reader_andwriter/backupsystem/backupdestination";

        backupService.createBackup(sourcePath, destinationPath);

    }
}
