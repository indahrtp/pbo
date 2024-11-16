// Kelas Motor yang mengimplementasikan abstract class Kendaraan
class Motor extends Kendaraan {
    // Constructor yang mengatur tarif dasar khusus Motor
    public Motor() {
        super(3000);  // Tarif dasar Motor
    }

    // Implementasi method calculateFare untuk Motor
    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * 500);  // Hitung ongkos perjalanan
    }

    // Implementasi method getVehicleType dari interface Vehicle
    @Override
    public String getVehicleType() {
        return "Motor";
    }
}
