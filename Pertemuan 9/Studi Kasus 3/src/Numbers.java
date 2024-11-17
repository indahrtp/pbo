import java.util.Scanner;

public class Numbers {
    public static void main (String[] args)
    {
        Integer [] intList; // merubah int[] menjadi Integer[]
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size]; // merubah int[] menjadi Integer[]

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();

        Sorting.insertionSort(intList);

        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}