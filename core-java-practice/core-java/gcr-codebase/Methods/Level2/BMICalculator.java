import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] persons) {

        for (int i = 0; i < persons.length; i++) {

            double weight = persons[i][0];
            double heightInMeters = persons[i][1] / 100.0;

            persons[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getBMIStatus(double[][] persons) {

        String[] status = new String[persons.length];

        for (int i = 0; i < persons.length; i++) {

            double bmi = persons[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal Weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        for (int i = 0; i < persons.length; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }
        calculateBMI(persons);
        String[] status = getBMIStatus(persons);

        System.out.println("\nWeight\tHeight(cm)\tBMI\t\tStatus");

        for (int i = 0; i < persons.length; i++) {

            System.out.printf("%.2f\t%.2f\t\t%.2f\t\t%s%n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }
    }
}