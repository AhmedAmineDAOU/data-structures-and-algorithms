package arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondMaxArrayTest {

    @Test
    void findSecondMaxArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected = 8;
        int actual = SecondMaxArray.findSecondMaxArray(array);
        assertEquals(expected, actual);
    }
}