import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            int x = scanner.nextInt();
        }
        System.out.println("==============================");

        scanner.close();
    }
}
