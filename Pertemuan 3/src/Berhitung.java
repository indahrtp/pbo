import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int B = scanner.nextInt();

        int result = 0;

        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                if (B != 0) {
                    result = A/B;
                } else {
                    System.out.println("Pembagian dengan 0 tidak valid");
                    return;
                }
                break;
            case '%':
                if (B != 0) {
                    result = A % B;
                } else {
                    System.out.println("Error: Modulus dengan 0 tidak valid");
                    return;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid");
                return;
        }
        System.out.println(result);

        scanner.close();
    }
}
