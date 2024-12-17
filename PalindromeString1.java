public class PalindromeString1 {
    public static void main(String[] args) {
        // Predefined string
        String str = "madam";  // Change this to test other strings
        
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();
        
        // Initialize variables for the left and right pointers
        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        // Check each character from the left and right ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output the result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
