package com.polban.jtk.example;

import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class MainProgram {
    public static void main(String[] args) {
        // Membuat objek Product
        Product product = new Product("Laptop", 15000000.00, 10);

        // Membuat objek Sales
        Sales sales = new Sales(product);

        // Penjualan produk dengan quantity 5
        sales.sellProduct(3);

        // Restock produk
        sales.restockProduct(5);

        // Memperbarui harga produk
        sales.updateProductPrice(1.4E7);

        // Mencoba memperbarui harga dengan nilai negatif
        sales.updateProductPrice(-1.4E7);
    }
}
