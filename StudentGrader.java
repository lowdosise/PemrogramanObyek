

// Tanggung jawab 2: Mencetak laporan
class GradePrinter {
    public void cetakLaporan(String nama, double nilai) {
        System.out.println("Laporan Nilai Mahasiswa: " + nama + " = " + nilai);
    }
}

// Tanggung jawab 3: Menyimpan data
class GradeRepository {
    public void simpanDatabase(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}

public class StudentGrader {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        GradePrinter printer = new GradePrinter();
        GradeRepository repository = new GradeRepository();

        double nilai = calculator.hitungNilaiAkhir(80, 85, 90);
        printer.cetakLaporan("Andi", nilai);
        repository.simpanDatabase("Andi", nilai);
    }
} 
    

