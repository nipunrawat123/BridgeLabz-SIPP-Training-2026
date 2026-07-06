import java.util.Scanner;

public class FactorsOperations {

    public static int[] findFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findGreatestFactor(int[] factors) {

        if (factors.length == 1) {
            return factors[0];
        }

        return factors[factors.length - 2];
    }

    public static int findSum(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    public static long findProduct(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    public static double findProductOfCubes(int[] factors) {

        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();

        System.out.println("Greatest Factor = " +
                findGreatestFactor(factors));

        System.out.println("Sum of Factors = " +
                findSum(factors));

        System.out.println("Product of Factors = " +
                findProduct(factors));

        System.out.println("Product of Cubes = " +
                findProductOfCubes(factors));

        sc.close();
    }
}