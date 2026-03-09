import java.util.Scanner;

public class PalindromecheckerApp {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();

        PalindromecheckerApp obj = new PalindromecheckerApp();

        boolean result = obj.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }
}