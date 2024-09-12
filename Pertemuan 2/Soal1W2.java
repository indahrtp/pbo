import java.util.Scanner;

public class Soal1W2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {  // Loop untuk 5 kali input
            System.out.print("Masukkan Angka: ");
            String input = scanner.next();  // Membaca input angka sebagai string

            try {
                long number = Long.parseLong(input);
                System.out.println(number + " can be fitted in:");

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
