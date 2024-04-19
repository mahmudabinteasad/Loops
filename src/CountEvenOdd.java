import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by space: ");

        int evenCount = 0;
        int oddCount = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even inputs: " + evenCount);
        System.out.println("Number of odd inputs: " + oddCount);

        scanner.close();
    }
}
