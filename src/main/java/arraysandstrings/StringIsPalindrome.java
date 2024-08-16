package arraysandstrings;

public class StringIsPalindrome {
    public static boolean isPalindrom(String str) {
        char[] charArray = str.toCharArray();
        int start = 0, end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
