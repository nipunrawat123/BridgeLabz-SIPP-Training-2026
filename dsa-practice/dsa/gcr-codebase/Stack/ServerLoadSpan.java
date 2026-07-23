import java.util.Arrays;
import java.util.Stack;

public class ServerLoadSpan {

    static int[] loadSpan(int[] load) {

        int n = load.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && load[stack.peek()] <= load[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] load = {100, 80, 60, 70, 60, 75, 85};

        int[] result = loadSpan(load);

        System.out.println("Server Load:");
        System.out.println(Arrays.toString(load));

        System.out.println("Load Span:");
        System.out.println(Arrays.toString(result));
    }
}