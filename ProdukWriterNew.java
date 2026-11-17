import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class DataEntity<T, U, V> {
    private T field1;
    private U field2;
    private V field3;

    public DataEntity(T field1, U field2, V field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return field1 + "," + field2 + "," + field3;
    }
}

public class ProdukWriterNew {
    public static void main(String[] args) {
      
        List<DataEntity<String, Double, Integer>> produkList = new ArrayList<>();
        produkList.add(new DataEntity<>("Laptop", 15000000.0, 10));
        produkList.add(new DataEntity<>("Mouse", 150000.0, 50));
        produkList.add(new DataEntity<>("Keyboard", 350000.0, 30));

      
        List<DataEntity<String, String, Boolean>> pelangganList = new ArrayList<>();
        pelangganList.add(new DataEntity<>("CUST-01", "Andi", true));

        Path filePath = Paths.get("produk_output.txt");
        try {
            List<String> lines = new ArrayList<>();
            for (DataEntity<String, Double, Integer> p : produkList) {
                lines.add(p.toString());
            }
            Files.write(filePath, lines);
            System.out.println("Data berhasil disimpan. Membaca kembali isi file:");

          
            List<String> readLines = Files.readAllLines(filePath);
            readLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Gagal memproses file: " + e.getMessage());
        }
    }
}
 