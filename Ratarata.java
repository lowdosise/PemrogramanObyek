public class Ratarata {
    public static void main(String[] args) {

        double[] nilai = {80, 41, 75, 85, 95};
        double total = 0;

        for (int i = 0; i < 5; i++) {
            total += nilai[i];
        }
        double rataRata = total / 5;
        System.out.println("Rata-rata nilai: " + rataRata);
        
        if (rataRata % 2 == 0) {
            System.out.println("Rata-rata adalah bilangan genap");
        } else {
            System.out.println("Rata-rata adalah bilangan ganjil");
        }
    }
    
    {
    int nilai [] = {80, 41, 75, 85, 95};
    int Nilai_Tertinggi = nilai[0]; 


    for (int i = 1; i < nilai.length; i++) {
        if (nilai[i] > Nilai_Tertinggi) {
            Nilai_Tertinggi = nilai[i];
        }
    }
    System.out.println("Nilai tertinggi: " + Nilai_Tertinggi);
    }
}
