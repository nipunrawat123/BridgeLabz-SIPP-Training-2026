class TaskNode {
    int data;
    TaskNode next;

    TaskNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TaskQueueDeletion {

    static TaskNode removeTask(TaskNode head, int taskId) {

        if (head == null) {
            return null;
        }

        // Delete first node
        if (head.data == taskId) {
            return head.next;
        }

        TaskNode prev = head;
        TaskNode curr = head.next;

        while (curr != null && curr.data != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    static void display(TaskNode head) {
        TaskNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        TaskNode head = new TaskNode(10);
        head.next = new TaskNode(20);
        head.next.next = new TaskNode(30);
        head.next.next.next = new TaskNode(40);

        System.out.println("Before Deletion:");
        display(head);

        head = removeTask(head, 30);

        System.out.println("After Deletion:");
        display(head);
    }
}