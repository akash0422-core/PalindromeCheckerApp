import java.util.Scanner;

public class PalindromecheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Normalize input for case-insensitive check
        String text = input.toLowerCase();

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result exactly as requested
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}