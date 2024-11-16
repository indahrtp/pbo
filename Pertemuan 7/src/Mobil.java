// Kelas Mobil yang mengimplementasikan abstract class Kendaraan
class Mobil extends Kendaraan {
    // Constructor yang mengatur tarif dasar khusus Mobil
    public Mobil() {
        super(5000);  // Tarif dasar Mobil
    }

    // Implementasi method calculateFare untuk Mobil
    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * 1000);  // Hitung ongkos perjalanan
    }

    // Implementasi method getVehicleType dari interface Vehicle
    @Override
    public String getVehicleType() {
        return "Mobil";
    }
}
