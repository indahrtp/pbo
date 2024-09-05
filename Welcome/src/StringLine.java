import java.util.Scanner;

public class StringLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        scanner.close();

        // 1. Sum the lengths of A and B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        // 2. Determine if A is lexicographically larger than B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter of A and B, only if they are not empty
        String capitalizedA = A.isEmpty() ? A : A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.isEmpty() ? B : B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print the capitalized strings separated by a space
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
