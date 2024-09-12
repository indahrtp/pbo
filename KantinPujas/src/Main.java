import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek menu makanan
        Menu makanan1 = new Menu();
        makanan1.setJenisMenu("Makanan");
        makanan1.setNamaMenu("Nasi Goreng");
        makanan1.setHargaMenu(20000);
        makanan1.setStokMenu(10);

        Menu makanan2 = new Menu();
        makanan2.setJenisMenu("Makanan");
        makanan2.setNamaMenu("Mie Ayam");
        makanan2.setHargaMenu(15000);
        makanan2.setStokMenu(8);

        // Membuat objek menu minuman
        Menu minuman1 = new Menu();
        minuman1.setJenisMenu("Minuman");
        minuman1.setNamaMenu("Es Teh");
        minuman1.setHargaMenu(5000);
        minuman1.setStokMenu(20);

        Menu minuman2 = new Menu();
        minuman2.setJenisMenu("Minuman");
        minuman2.setNamaMenu("Es Jeruk");
        minuman2.setHargaMenu(6000);
        minuman2.setStokMenu(15);

        // Membuat objek pembeli
        Pembeli pembeli = new Pembeli();
        System.out.print("Masukkan nama pembeli: ");
        pembeli.setNamaPembeli(scanner.nextLine());
        System.out.print("Masukkan nomor meja: ");
        pembeli.setNoMeja(scanner.nextInt());

        // Menampilkan menu
        System.out.println("=== Daftar Menu ===");
        System.out.println("1. " + makanan1.getNamaMenu() + " (Rp " + makanan1.getHargaMenu() + ") - Stok: " + makanan1.getStokMenu());
        System.out.println("2. " + makanan2.getNamaMenu() + " (Rp " + makanan2.getHargaMenu() + ") - Stok: " + makanan2.getStokMenu());
        System.out.println("3. " + minuman1.getNamaMenu() + " (Rp " + minuman1.getHargaMenu() + ") - Stok: " + minuman1.getStokMenu());
        System.out.println("4. " + minuman2.getNamaMenu() + " (Rp " + minuman2.getHargaMenu() + ") - Stok: " + minuman2.getStokMenu());

        // Membuat pesanan
        Pesan pesan = new Pesan();
        System.out.print("Pilih nomor menu yang ingin dipesan: ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan jumlah pesanan: ");
        int kuantitas = scanner.nextInt();

        Menu menuTerpilih;
        switch (pilihan) {
            case 1:
                menuTerpilih = makanan1;
                break;
            case 2:
                menuTerpilih = makanan2;
                break;
            case 3:
                menuTerpilih = minuman1;
                break;
            case 4:
                menuTerpilih = minuman2;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        // Memeriksa stok
        if (kuantitas > menuTerpilih.getStokMenu()) {
            System.out.println("Maaf, stok tidak mencukupi.");
        } else {
            pesan.setNoPesan(1);
            pesan.setKuantitas(kuantitas);
            int subHarga = kuantitas * menuTerpilih.getHargaMenu();
            pesan.setSubHarga(subHarga);
            pesan.setTotalHarga(subHarga);

            // Mengurangi stok menu
            menuTerpilih.kurangiStok(kuantitas);

            // Menampilkan ringkasan pesanan
            System.out.println("\n=== Ringkasan Pesanan ===");
            System.out.println("Pembeli: " + pembeli.getNamaPembeli());
            System.out.println("Nomor Meja: " + pembeli.getNoMeja());
            System.out.println("Menu yang dipesan: " + menuTerpilih.getNamaMenu());
            System.out.println("Jumlah pesanan: " + pesan.getKuantitas());
            System.out.println("Subtotal harga: Rp " + pesan.getSubHarga());
            System.out.println("Total harga: Rp " + pesan.getTotalHarga());
        }

        scanner.close();
    }
}