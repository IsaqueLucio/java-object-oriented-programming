package file_io.file_reader_and_writer.backup_system;

public class TestBackup {
    public static void main(String[] args) {
        
        BackupService backupService = new BackupService();

        String sourcePath = "file_io/file_reader_and_writer/backup_system/original_fille_location/OriginalFile.txt";
        String destinationPath = "file_io/file_reader_and_writer/backup_system/backup_destination";

        backupService.createBackup(sourcePath, destinationPath);

    }
}
