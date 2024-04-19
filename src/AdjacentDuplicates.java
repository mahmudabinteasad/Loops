import java.util.Scanner;
public class AdjacentDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by space: ");
        int prev = scanner.nextInt();
        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            if (current == prev) {
                System.out.print(current + " ");
            }
            prev = current;
        }
        scanner.close();
    }
}
