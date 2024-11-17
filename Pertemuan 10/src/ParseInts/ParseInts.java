import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0; // Variabel untuk menyimpan nilai integer dan total sum
        Scanner scan = new Scanner(System.in); // Scanner untuk input dari pengguna

        // Meminta pengguna memasukkan satu baris teks
        System.out.println("Enter a line of text");
        String line = scan.nextLine(); // Membaca input pengguna sebagai satu baris

        // Scanner kedua untuk membaca baris input kata demi kata (token)
        Scanner scanLine = new Scanner(line);

        // Loop untuk memproses setiap token dalam input
        while (scanLine.hasNext()) {
            try {
                // Mencoba mengonversi token menjadi integer
                val = Integer.parseInt(scanLine.next());
                sum += val; // Jika berhasil, tambahkan ke total sum
            } catch (NumberFormatException e) {
                // Jika token bukan bilangan bulat, abaikan tanpa menghentikan program
                // Optional: Cetak pesan kesalahan jika ingin tahu token non-integer
                System.out.println("Not an integer, skipping...");
            }
        }

        // Menampilkan hasil penjumlahan integer yang ditemukan dalam baris input
        System.out.println("The sum of the integers on this line is " + sum);
    }
}

