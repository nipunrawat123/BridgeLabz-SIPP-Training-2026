public class EmployeeBonus {

    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {

            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11) + 1;
        }

        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] data) {

        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }

        return result;
    }

    public static void displayReport(double[][] data, double[][] result) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n",
                "Emp", "Old Salary", "Years", "Bonus", "New Salary");

        for (int i = 0; i < data.length; i++) {

            System.out.printf("%-10d %-15.2f %-15.0f %-15.2f %-15.2f%n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    result[i][0],
                    result[i][1]);

            totalOldSalary += data[i][0];
            totalBonus += result[i][0];
            totalNewSalary += result[i][1];
        }

        System.out.println();

        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }

    public static void main(String[] args) {

        double[][] employeeData = generateEmployeeData(10);

        double[][] result =
                calculateBonusAndNewSalary(employeeData);

        displayReport(employeeData, result);
    }
}