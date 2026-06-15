public class KingdomTax {
    public static void main(String[] args) {
        double[] incomes = {8000, 12000, 25000, 55000, 70000, 9500, 40000, 51000, 15000, 90000};
        double totalTax = 0;
        for (int i = 0; i < incomes.length; i++) {
            double income = incomes[i];
            double tax;
            String bracket;
            if (income < 10000) {
                tax = income * 0.05;
                bracket = "5% Tax Bracket";
            }
            else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax Bracket";
            }
            else {
                tax = income * 0.30;
                bracket = "30% Tax Bracket";
            }
            System.out.println("Citizen " + (i + 1));
            System.out.println("Income: " + income);
            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);
    }
}