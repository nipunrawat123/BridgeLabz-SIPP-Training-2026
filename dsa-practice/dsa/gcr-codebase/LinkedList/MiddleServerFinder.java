class ServerNode {
    int data;
    ServerNode next;

    ServerNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleServerFinder {

    static ServerNode findMiddleServer(ServerNode head) {

        ServerNode slow = head;
        ServerNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static void display(ServerNode head) {

        ServerNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ServerNode head = new ServerNode(10);
        head.next = new ServerNode(20);
        head.next.next = new ServerNode(30);
        head.next.next.next = new ServerNode(40);
        head.next.next.next.next = new ServerNode(50);

        System.out.println("Server Chain:");
        display(head);

        ServerNode middle = findMiddleServer(head);

        System.out.println("Middle Server: " + middle.data);
    }
}