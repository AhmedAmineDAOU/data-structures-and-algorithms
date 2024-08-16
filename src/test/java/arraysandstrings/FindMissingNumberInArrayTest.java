package arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMissingNumberInArrayTest {

    @Test
    void findMissingNumber() {
            int[] array = {1, 2, 4, 5, 6};
            int expected = 3;
            int actual = FindMissingNumberInArray.findMissingNumber(array);
            assertEquals(expected, actual, "The missing number should be 3");
        }

    @Test
    public void NoMissingNumber() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int expected = 0; // Assuming 0 means no missing number in this context
        int actual = FindMissingNumberInArray.findMissingNumber(array);
        assertNotEquals(expected, actual, "There should be no missing number");
    }
}