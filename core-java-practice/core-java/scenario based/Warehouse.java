import java.util.HashSet;
public class Warehouse {
    public static void main(String[] args) {
        int[] stock = {50, 20, 70, 40, 20, 90, 50};
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int item : stock) {
            if (item > max) {
                max = item;
            }

            if (item < min) {
                min = item;
            }

            total += item;
        }

        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Duplicates: ");
        for (int item : stock) {
            if (!set.add(item)) {
                System.out.print(item + " ");
            }
        }

        System.out.println();

        // Rotate Array by k positions
        int k = 2;
        rotate(stock, k);

        System.out.print("Rotated Array: ");
        for (int item : stock) {
            System.out.print(item + " ");
        }
        System.out.println();
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Transpose Matrix:");

        int[][] transpose = transpose(shelf);

        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Rotate array right by k positions
    public static void rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Transpose Matrix
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}