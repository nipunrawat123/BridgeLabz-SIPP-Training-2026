class UrlNode {
    int data;
    UrlNode next;

    UrlNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RedirectLoopDetector {

    static boolean hasRedirectLoop(UrlNode head) {

        UrlNode slow = head;
        UrlNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        UrlNode head = new UrlNode(10);
        head.next = new UrlNode(20);
        head.next.next = new UrlNode(30);
        head.next.next.next = new UrlNode(40);
        head.next.next.next.next = head.next;

        if (hasRedirectLoop(head)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}