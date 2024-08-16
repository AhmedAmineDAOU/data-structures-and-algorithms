package arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringIsPalindromeTest {
    @Test
    public void testStringIsPalindrome() {
        String madam = "madam";
        String that = "that";
        boolean actualMadam = StringIsPalindrome.isPalindrom(madam);
        boolean actualThat = StringIsPalindrome.isPalindrom(that);
        assertTrue(actualMadam);
        assertFalse(actualThat);
    }
}