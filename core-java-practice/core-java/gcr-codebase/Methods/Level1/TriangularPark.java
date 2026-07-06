import java.util.Scanner;
public class TriangularPark {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter Side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter Side 3: ");
        double side3 = sc.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds needed = " + rounds);
    }
}