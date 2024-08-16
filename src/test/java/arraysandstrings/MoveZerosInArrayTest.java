package arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveZerosInArrayTest {

    @Test
    void moveZeros() {
        int[] array = {1, 0, 4, 0, 6};
        int[] expected = {1, 4, 6, 0, 0};;
        MoveZerosInArray.moveZeros(array);
        assertArrayEquals(expected, array,"The arrays should be equal after moving zeros.");
    }
}