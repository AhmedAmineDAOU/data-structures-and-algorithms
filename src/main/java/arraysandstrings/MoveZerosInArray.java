package arraysandstrings;

public class MoveZerosInArray {
    //move zeros to the right and keeping order
    /* Key Concepts:
    Two Pointers: The algorithm uses two pointers:
    i: Traverses the array to find non-zero elements.
    j: Keeps track of the position where the next non-zero element should be placed.*/
    public static void moveZeros(int[] array) {
        int j = 0; //pointer on zero values
        for (int i = 0; i < array.length; i++) { // i = pointer on non zero values
            if (array[i] != 0 && array[j] == 0) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            //After a swap, or if the element at j is already non-zero, the pointer j is incremented to move forward.
            if (array[j] != 0) {
                j++;
            }
        }
    }


}
