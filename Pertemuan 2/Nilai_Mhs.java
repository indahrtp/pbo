import java.util.Scanner;

public class Nilai_Mhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int nilai1, nilai2, nilai3;
        char grade = ' ';
        double nilai_uts, nilai_uas, nilai_tugas, nilai_akhir;

        System.out.println("\n==================================================");
        System.out.println("========= PROGRAM PENILAIAN MAHASISWA ============");
        System.out.println("==================================================");

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Tugas: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilai3 = input.nextInt();

        nilai_tugas = nilai1 * 0.20;
        nilai_uts = nilai2 * 0.35;
        nilai_uas = nilai3 * 0.40;
        nilai_akhir = nilai_tugas + nilai_uts + nilai_uas;

        if (nilai_akhir >= 85) {
            grade = 'A';
        } else if (nilai_akhir >= 75) {
            grade = 'B';
        } else if (nilai_akhir >= 65) {
            grade = 'C';
        } else if (nilai_akhir >= 49) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("==================================================");
        System.out.println("Nilai Mahasiswa dengan nama " + nama);
        System.out.println("Nilai Tugas (20%): " + nilai_tugas);
        System.out.println("Nilai UTS (35%): " + nilai_uts);
        System.out.println("Nilai UAS (40%): " + nilai_uas);
        System.out.println("Nilai Akhir: " + nilai_akhir);
        System.out.println("Grade: " + grade);
    }
}
