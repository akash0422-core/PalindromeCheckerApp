import java.util.Scanner;
import java.util.Stack;

public class PalindromecheckerApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        // Declare and initialize the input string from user
        String input = scanner.nextLine();

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        for (char c : input.toCharArray()) {
            // Compare current character with the top of the stack (the reverse)
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Output the results to match your screenshot format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close(); // Good practice to close the scanner
    }
}