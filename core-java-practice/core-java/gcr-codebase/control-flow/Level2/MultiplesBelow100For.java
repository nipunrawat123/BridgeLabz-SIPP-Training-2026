import java.util.Scanner;

public class MultiplesBelow100For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number <= 0
                || number >= 100) {

            System.out.println(
                    "Invalid Input");

            return;
        }

        for(int i = 100;
            i >= 1;
            i--) {

            if(i % number == 0)

                System.out.print(
                        i + " ");
        }

        sc.close();
    }
}