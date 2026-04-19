package file_io.file_writer.system_text_logger;

public class TestLogger {
    public static void main(String[] args) {
        SystemLogger systemLogger = new SystemLogger();
        systemLogger.createLog("18:00 - Starting the system.");
        systemLogger.createLog("18:01 - Admin logged in the system.");
        systemLogger.createLog("18:02 - Erro: Attempted intrusion detected.");
    }
    
}
