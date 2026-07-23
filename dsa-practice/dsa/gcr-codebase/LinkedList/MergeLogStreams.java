class LogNode {
    int data;
    LogNode next;

    LogNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLogStreams {

    static LogNode mergeLists(LogNode list1, LogNode list2) {

        LogNode dummy = new LogNode(0);
        LogNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    static void display(LogNode head) {

        LogNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LogNode list1 = new LogNode(10);
        list1.next = new LogNode(30);
        list1.next.next = new LogNode(50);

        LogNode list2 = new LogNode(20);
        list2.next = new LogNode(40);
        list2.next.next = new LogNode(60);

        System.out.println("List 1:");
        display(list1);

        System.out.println("List 2:");
        display(list2);

        LogNode merged = mergeLists(list1, list2);

        System.out.println("Merged List:");
        display(merged);
    }
}