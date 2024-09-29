package com.polban.jtk.inventori;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Setter khusus untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah penambahan tidak valid!");
        }
    }
}
