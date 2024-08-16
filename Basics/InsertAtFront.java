import java.util.*;

// Node class representing a single node in the linked list
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class InsertAtFront {

    // Method to insert a new node at the front of the linked list
    public static Node insertAtFront(Node head, int new_data) {
        // Create a new node with the given data
        Node new_node = new Node(new_data);
        new_node.next = head;
        return new_node;
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list 2->3->4->5
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        // Print the original list
        System.out.println("Original Linked List");
        printList(head);

        // Insert a new node with data 1 at the front of the list
        System.out.println("After inserting Nodes at the front");
        int data = 1;
        head = insertAtFront(head, data);
        printList(head);
    }
}
