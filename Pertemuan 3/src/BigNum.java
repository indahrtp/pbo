import java.math.BigInteger;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Baca input berupa dua bilangan besar
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Ubah string menjadi objek BigInteger
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        // Lakukan penjumlahan dan perkalian
        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);

        // Cetak hasil penjumlahan dan perkalian
        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}