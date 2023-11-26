import org.example.Palindrome;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        // Позитивный тест - слово "radar" является палиндромом
        assertTrue(Palindrome.isPalindrome("radar"));

        // Позитивный тест - фраза "A man a plan a canal Panama" является палиндромом
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));

        // Негативный тест - слово "hello" не является палиндромом
        assertFalse(Palindrome.isPalindrome("hello"));

        // Негативный тест - фраза "This is not a palindrome" не является палиндромом
        assertFalse(Palindrome.isPalindrome("This is not a palindrome"));
    }
}
