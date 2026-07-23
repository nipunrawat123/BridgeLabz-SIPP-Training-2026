class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PlaylistInsertion {

    static void insertAfter(Node current, int trackId) {
        if (current == null) {
            System.out.println("Current node cannot be null");
            return;
        }

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        System.out.println("Before Insertion:");
        display(head);

        insertAfter(head.next, 30);

        System.out.println("After Insertion:");
        display(head);
    }
}