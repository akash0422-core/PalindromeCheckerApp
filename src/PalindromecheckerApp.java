public class PalindromecheckerApp {

    /**
     * Application entry point for UC9
     */
    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Call recursive method
        boolean result = check(input, 0, input.length() - 1);

        // Display output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}