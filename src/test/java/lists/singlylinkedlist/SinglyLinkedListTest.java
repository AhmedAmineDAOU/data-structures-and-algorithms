package lists.singlylinkedlist;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {
    private SinglyLinkedList list;

    @BeforeEach
    public void setUp() {
        list = new SinglyLinkedList();
    }

    @Test
    public void testInsertAtBeginning() {
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        assertEquals(Arrays.asList(20, 10), list.toList());
    }

    @Test
    public void testInsertAtEnd() {
        list.insertNodeAtEnd(10);
        list.insertNodeAtEnd(20);
        assertEquals(Arrays.asList(10, 20), list.toList());
    }

    @Test
    public void testInsertAtPosition() {
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        list.insertNodeAtPosition(15, 2);
        assertEquals(Arrays.asList(20, 15, 10), list.toList());
    }

    @Test
    public void testDeleteFirst() {
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        list.deleteFirst();
        assertEquals(List.of(10), list.toList());
    }

    @Test
    public void testDeleteLast() {
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        list.deleteLast();
        assertEquals(List.of(20), list.toList());
    }

    @Test
    public void testDeleteFromGivenPosition() {
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        list.insertNodeAtBeginning(30);
        list.deleteNodeFromGivenPosition(2);
        assertEquals(Arrays.asList(30, 10), list.toList());
    }

    @Test
    public void testGetLength() {
        assertEquals(0, list.getLength());
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        assertEquals(2, list.getLength());
    }

    @Test
    public void testFind() {
        assertFalse(list.find(10));
        list.insertNodeAtBeginning(10);
        assertTrue(list.find(10));
    }

    @Test
    public void testToList(){
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        list.insertNodeAtBeginning(30);

        assertEquals(Arrays.asList(30,20,10),list.toList());

    }

    @Test
    public void testReverseList() {
        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);
        list.insertNodeAtBeginning(30);

        assertEquals(Arrays.asList(10, 20, 30), list.toList());


    }
}