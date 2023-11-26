import org.example.Palindrome;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {

    @Test
    public void testIsPalindromeSingleWord() {
        assertTrue(Palindrome.isPalindrome("radar"));
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromePhrase() {
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
        assertFalse(Palindrome.isPalindrome("This is not a palindrome"));
    }

    @Test
    public void testIsPalindromeCaseInsensitive() {
        assertTrue(Palindrome.isPalindrome("Racecar"));
        assertFalse(Palindrome.isPalindrome("Java"));
    }

    @Test
    public void testIsPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("Was it a car or a cat I saw"));
        assertFalse(Palindrome.isPalindrome("Not a palindrome"));
    }
}
