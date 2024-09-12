import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Baca input berupa 4 plat number mobil
        String plat1 = scanner.next();
        String plat2 = scanner.next();
        String plat3 = scanner.next();
        String plat4 = scanner.next();

        // Gabungkan angka dari plat number menjadi satu string
        String combined = plat1 + plat2 + plat3 + plat4;

        // Ubah string yang sudah digabungkan menjadi bilangan bulat
        long combinedNumber = Long.parseLong(combined);

        // Kurangi dengan 999999
        combinedNumber -= 999999;

        // Cek apakah hasilnya habis dibagi 5
        if (combinedNumber % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }

        scanner.close();
    }
}