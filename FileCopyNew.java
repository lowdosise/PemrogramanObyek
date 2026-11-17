import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;

public class FileCopyNew {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path logFile = Paths.get("log.txt");

        try {
            Files.write(source, List.of("Report Generated", "Status: OK"));

            if (Files.exists(source)) {
                if (Files.notExists(backup.getParent())) {
                    Files.createDirectories(backup.getParent());
                }
                Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
                String logMsg = LocalDateTime.now() + " - Backup berhasil dibuat.\n";
                Files.writeString(logFile, logMsg, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("Backup created successfully!");
            } else {
                String logMsg = LocalDateTime.now() + " - Gagal: File sumber tidak ditemukan.\n";
                Files.writeString(logFile, logMsg, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}