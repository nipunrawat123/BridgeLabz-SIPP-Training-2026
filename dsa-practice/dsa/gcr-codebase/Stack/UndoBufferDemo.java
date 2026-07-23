public class UndoBufferDemo {

    static class UndoBuffer {

        private String[] data;
        private int top;

        UndoBuffer(int maxDepth) {
            data = new String[maxDepth];
            top = -1;
        }

        // Push operation
        boolean push(String edit) {

            if (top == data.length - 1) {
                System.out.println("Undo Buffer is Full");
                return false;
            }

            data[++top] = edit;
            return true;
        }

        // Pop operation
        String pop() {

            if (isEmpty()) {
                return "Nothing to Undo";
            }

            return data[top--];
        }

        // Peek operation
        String peek() {

            if (isEmpty()) {
                return "Undo Buffer is Empty";
            }

            return data[top];
        }

        boolean isEmpty() {
            return top == -1;
        }

        void display() {

            if (isEmpty()) {
                System.out.println("Undo Buffer is Empty");
                return;
            }

            System.out.println("Undo Buffer:");

            for (int i = top; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String[] args) {

        UndoBuffer buffer = new UndoBuffer(5);

        buffer.push("Typed Hello");
        buffer.push("Typed World");
        buffer.push("Deleted World");

        buffer.display();

        System.out.println("\nPeek: " + buffer.peek());

        System.out.println("Undo: " + buffer.pop());

        System.out.println("\nAfter Undo:");
        buffer.display();
    }
}