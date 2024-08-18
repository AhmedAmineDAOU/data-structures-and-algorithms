package lists.singlylinkedlist;

public class SinglyLinkedList {
//    Singly Linked List
//
//    Singly Linked List is a data structure used for storing collection
//    of nodes and has following properties -
//
//            • It contains sequence of nodes.
//            • A node has data and reference to next node in a list.
//            • First node is the head node.
//            • Last node has data and points to null.

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode iterator = head;
        while (iterator != null) {
            System.out.print(iterator.data + "-->");
            iterator = iterator.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int getLength() {
        int length = 0;
        ListNode iterator = head;
        while (iterator != null) {
            length++;
            iterator = iterator.next;
        }
        return length;
    }

    public void insertNodeAtBeginning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        this.head = newNode;
    }

    public void insertNodeAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (this.head == null) {
            head = newNode;
            return;
        }
        ListNode iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = newNode;
    }

    public void insertNodeAtPosition(int value, int position) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            insertNodeAtBeginning(value);
        } else {
            ListNode previous = head;
            int itPos = 1;
            while (itPos < position - 1) {
                itPos++;
                previous = previous.next;
            }
            newNode.next = previous.next;
            previous.next = newNode;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        list.display();
        int length = list.getLength();
        System.out.println("Length: " + length);
        list.insertNodeAtBeginning(0);
        list.display();
        list.insertNodeAtEnd(5);
        list.display();
        list.insertNodeAtPosition(-1, 1);
        list.display();
    }

}
