package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node head;
    public void deleteLast() {
        if (head == null) {
            // Linked list is empty, nothing to delete
            return;
        }
    
        if (head.next == null) {
            // Linked list has only one node
            head = null;
            return;
        }
    
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
    
        // Delete the last node
        current.next = null;
    }
    
    LinkedList() {
        head = null;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of range");
            return;
        }
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Original list:");
        list.printList(); // Output: 1 2 3 4

        list.insertAtPosition(5, 4);

        System.out.println("List after inserting 5 at the 4th position:");
        list.deleteLast();
        list.printList(); // Output: 1 2 3 5 4
       
    }
}
