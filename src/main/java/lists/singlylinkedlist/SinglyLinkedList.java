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
    }

}
