public class CallStackDemo {
    static class Frame {

        String functionName;
        Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    static class CallStack {

        private Frame top = null;


        void push(String functionName) {
            top = new Frame(functionName, top);
        }


        String pop() {

            if (isEmpty()) {
                return "No Active Function";
            }

            String name = top.functionName;
            top = top.next;

            return name;
        }


        String peek() {

            if (isEmpty()) {
                return "Call Stack is Empty";
            }

            return top.functionName;
        }

        // Check if stack is empty
        boolean isEmpty() {
            return top == null;
        }

        // Display stack
        void display() {

            if (isEmpty()) {
                System.out.println("Call Stack is Empty");
                return;
            }

            System.out.println("Current Call Stack:");

            Frame temp = top;

            while (temp != null) {
                System.out.println(temp.functionName);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validateUser()");
        stack.push("checkPassword()");

        stack.display();

        System.out.println("\nCurrent Function: " + stack.peek());

        System.out.println("Function Returned: " + stack.pop());

        System.out.println("\nAfter Pop:");

        stack.display();
    }
}