class HistoryNode {
    int data;
    HistoryNode next;

    HistoryNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class BrowserHistoryReverse {

    static HistoryNode reverseHistory(HistoryNode head) {

        HistoryNode prev = null;
        HistoryNode curr = head;

        while (curr != null) {
            HistoryNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void display(HistoryNode head) {

        HistoryNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        HistoryNode head = new HistoryNode(10);
        head.next = new HistoryNode(20);
        head.next.next = new HistoryNode(30);
        head.next.next.next = new HistoryNode(40);

        System.out.println("Original List:");
        display(head);

        head = reverseHistory(head);

        System.out.println("Reversed List:");
        display(head);
    }
}