// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Kendaraan mobil = new Mobil();
        System.out.println("Tipe Kendaraan: " + mobil.getVehicleType());
        System.out.println("Tarif Dasar: " + mobil.getBaseFare());
        System.out.println("Ongkos perjalanan 10 km: " + mobil.calculateFare(10));

        System.out.println();

        // Membuat objek Motor
        Kendaraan motor = new Motor();
        System.out.println("Tipe Kendaraan: " + motor.getVehicleType());
        System.out.println("Tarif Dasar: " + motor.getBaseFare());
        System.out.println("Ongkos perjalanan 10 km: " + motor.calculateFare(10));
    }
}
