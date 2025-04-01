public class LinkedList {
    Node head;

    // Inner class representing a node in the linked list
    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the LinkedList class
        LinkedList linkedList = new LinkedList();

        // Setting values for each node in the linked list
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connecting each node in the linked list
        linkedList.head.next = second;
        second.next = third;

        // Printing the linked list
        Node pointer = linkedList.head;
        System.out.print("LinkedList: ");
        while (pointer != null) {
            System.out.print(pointer.value + " ");
            pointer = pointer.next;
        }
    }
}