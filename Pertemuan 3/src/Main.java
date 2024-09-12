import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int gajiPokok = 500000;
    int hargaItem = 50000;

    int totalItemTerjual = scanner.nextInt();

    double totalGaji = gajiPokok;

    int totalPenjualan = totalItemTerjual * hargaItem;

        if(totalItemTerjual >=80)

    {
        totalGaji += totalPenjualan * 0.35;
    } else if(totalItemTerjual >=40)

    {
        totalGaji += totalPenjualan * 0.25;
    } else if(totalItemTerjual< 15)

    {
        int defisit = 15 - totalItemTerjual;
        totalGaji -= defisit * hargaItem * 0.15;
    } else {
        totalGaji += totalPenjualan * 0.10;
    }

    System.out.printf("%.0f%n",totalGaji);

    scanner.close();

    }
}