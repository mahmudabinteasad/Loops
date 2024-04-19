import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = input.replaceAll("[aeiouAEIOU]", "_");
        System.out.println("String with vowels replaced by underscore: " + result);
        scanner.close();
    }
}