import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y"; // Variabel untuk melanjutkan atau berhenti
        Scanner scan = new Scanner(System.in); // Scanner untuk input pengguna

        // Loop untuk terus meminta input selama pengguna memasukkan 'y'
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            try {
                // Meminta pengguna untuk memasukkan integer
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();

                // Memanggil metode factorial dan mencetak hasilnya
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Menangkap exception dan mencetak pesan error
                System.out.println(e.getMessage());
            }

            // Menanyakan apakah pengguna ingin memasukkan bilangan lain
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
