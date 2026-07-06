import java.util.Scanner;

public class OddEvenNumbers2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number <= 0) {

            System.out.println(
                    "Not a Natural Number");

            return;
        }

        for(int i = 1; i <= number; i++) {

            if(i % 2 == 0)
                System.out.println(
                        i + " is Even");
            else
                System.out.println(
                        i + " is Odd");
        }

        sc.close();
    }
}