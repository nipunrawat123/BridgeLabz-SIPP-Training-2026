class RecursionProblems {
    static int moveCount = 0;
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static int binarySearch(int[] arr, int low, int high, int target) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);

        return binarySearch(arr, mid + 1, high, target);
    }

    public static int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static String reverseString(String str) {

        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str, int index, int count) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        if (str.charAt(index) == '(')
            return checkBalance(str, index + 1, count + 1);

        if (str.charAt(index) == ')')
            return checkBalance(str, index + 1, count - 1);

        return checkBalance(str, index + 1, count);
    }
}

public class HanoiTower {

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Tower of Hanoi Steps:");
        RecursionProblems.towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + RecursionProblems.moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500, 600};
        int target = 400;

        int index = RecursionProblems.binarySearch(
                prices, 0, prices.length - 1, target);

        System.out.println("\nBinary Search:");
        System.out.println("Price found at index = " + index);


        int num = 12345;
        System.out.println("\nSum of Digits = "
                + RecursionProblems.sumOfDigits(num));

        String text = "Temple";
        System.out.println("\nReversed String = "
                + RecursionProblems.reverseString(text));

        String expr = "((()))()";

        System.out.println("\nBalanced Parentheses: "
                + RecursionProblems.isBalanced(expr));
    }
}