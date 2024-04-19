import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by space: ");

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        scanner.close();
    }
}
