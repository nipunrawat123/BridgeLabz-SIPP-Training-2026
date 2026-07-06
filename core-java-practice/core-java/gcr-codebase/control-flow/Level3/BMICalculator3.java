import java.util.Scanner;

public class BMICalculator3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight =
                sc.nextDouble();

        double heightCm =
                sc.nextDouble();

        double heightMeter =
                heightCm / 100;

        double bmi =
                weight /
                        (heightMeter
                                * heightMeter);

        System.out.println(
                "BMI = " + bmi);

        if(bmi < 18.5)
            System.out.println(
                    "Underweight");

        else if(bmi < 25)
            System.out.println(
                    "Normal");

        else if(bmi < 30)
            System.out.println(
                    "Overweight");

        else
            System.out.println(
                    "Obese");

        sc.close();
    }
}