// Abstraksi umum semua kendaraan (mendukung OCP)
abstract class Vehicle {
    public abstract void move();
}

// Interface kecil sesuai kemampuan spesifik (mendukung ISP)
interface EngineStartable {
    void startEngine();
}

interface FuelRefillable {
    void isiBahanBakar();
}

interface BatteryChargeable {
    void isiBaterai();
}

// Implementasi konkret sesuai kemampuan masing-masing
class MobilListrik extends Vehicle implements EngineStartable, BatteryChargeable {
    @Override
    public void startEngine() { System.out.println("Menyalakan motor listrik..."); }
    @Override
    public void isiBaterai() { System.out.println("Mengisi baterai kendaraan listrik..."); }
    @Override
    public void move() { System.out.println("Mobil listrik melaju senyap."); }
}

class MobilBensin extends Vehicle implements EngineStartable, FuelRefillable {
    @Override
    public void startEngine() { System.out.println("Menyalakan mesin bensin..."); }
    @Override
    public void isiBahanBakar() { System.out.println("Mengisi bensin di SPBU..."); }
    @Override
    public void move() { System.out.println("Mobil bensin melaju."); }
}

class Sepeda extends Vehicle {
    @Override
    public void move() { System.out.println("Sepeda dikayuh."); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        MobilListrik mobilListrik = new MobilListrik();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();
        mobilListrik.move();

        Sepeda sepeda = new Sepeda();
        sepeda.move(); // Tidak lagi dipaksa memanggil startEngine()
    }
}