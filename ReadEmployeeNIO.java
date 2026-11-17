import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class ReadEmployeeNIO {
    public static void main(String[] args) {
        Path path = Paths.get("employees.txt");
        Path copyPath = Paths.get("copy_employees.txt");

        if (Files.notExists(path)) {
            System.out.println("Error: File employees.txt tidak ditemukan!");
            return;
        }

        List<String> employeeList = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                employeeList.add(line);
                System.out.println(line);
            }
            Files.write(copyPath, employeeList, StandardCharsets.UTF_8);
            System.out.println("Berhasil disalin ke copy_employees.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}