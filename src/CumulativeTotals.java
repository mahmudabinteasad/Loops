import java.util.Scanner;

public class CumulativeTotals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by space: ");

        int cumulativeTotal = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            cumulativeTotal += num;
            System.out.print(cumulativeTotal + " ");
        }

        scanner.close();
    }
}
