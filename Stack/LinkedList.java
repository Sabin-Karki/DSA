package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node top;

    LinkedList() {
        top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void pushStack(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Add at the end of the linked list
    void addAtLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            Node current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insert a new node at a specific position
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = top;
            top = newNode;
        } else {
            Node current = top;
            for (int i = 1; i < position && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
             System.out.println("invalid");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Delete the first node
    int deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
       
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Delete the last node
    void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        if (top.next == null) {
            top = null;
        } else {
            Node current = top;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Delete a node at any position
    void deleteAtPosition(int position) {
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        if (position == 0) {
            top = top.next;
        } else {
            Node current = top;
            for (int i = 1; i < position && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }
            current.next = current.next.next;
        }
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.pushStack(2);
        list.pushStack(1);
        list.display();

        //  the end of the linked list
        list.addAtLast(3);
        list.display();

        // Insert a new node at any position
        list.insertAtPosition(0, 2);
        list.insertAtPosition(4, 4);
        list.display();

        // Delete  first node
        list.deleteFirst();
        list.display();

        // Delete  last node
        list.deleteLast();
        list.display();

        // Delete node at any position
        list.deleteAtPosition(2);
        list.display();
    }
}
