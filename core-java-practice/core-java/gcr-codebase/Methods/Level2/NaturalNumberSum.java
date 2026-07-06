import java.util.Scanner;

public class NaturalNumberSum {
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }

        return n + findSumRecursive(n - 1);
    }
    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0");
            return;
        }

        int recursiveSum = findSumRecursive(n);
        int formulaSum = findSumFormula(n);

        System.out.println("Sum using Recursion = " + recursiveSum);
        System.out.println("Sum using Formula = " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }

        sc.close();
    }
}