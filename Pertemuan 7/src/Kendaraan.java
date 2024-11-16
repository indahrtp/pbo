// Abstract class yang mendefinisikan struktur dasar kendaraan
abstract class Kendaraan implements Vehicle {
    // Tarif dasar untuk semua kendaraan
    protected double baseFare;

    // Constructor untuk mengatur tarif dasar
    public Kendaraan(double baseFare) {
        this.baseFare = baseFare;
    }

    // Method abstract untuk menghitung ongkos perjalanan
    public abstract double calculateFare(double distance);

    // Method untuk mendapatkan tarif dasar
    public double getBaseFare() {
        return baseFare;
    }
}

// Interface yang mendefinisikan kemampuan umum kendaraan
interface Vehicle {
    String getVehicleType();  // Mendapatkan tipe kendaraan
}
