import java.util.Scanner;

public class MultiplesBelow100While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int counter = 100;

        while(counter >= 1) {

            if(counter % number == 0)

                System.out.print(
                        counter + " ");

            counter--;
        }

        sc.close();
    }
}