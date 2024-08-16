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
        }
    }

}
