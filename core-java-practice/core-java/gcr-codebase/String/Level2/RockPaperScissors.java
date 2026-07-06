import java.util.Scanner;

public class RockPaperScissors {
    static String computerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        }

        return "Scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    static String[][] getStatistics(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(Math.round((userWins * 100.0 / games) * 100.0) / 100.0);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(Math.round((computerWins * 100.0 / games) * 100.0) / 100.0);

        return stats;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        String[][] results = new String[games][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String computer = computerChoice();
            String winner = findWinner(user, computer);

            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        System.out.println("User\tComputer\tWinner");

        for (int i = 0; i < games; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        String[][] stats = getStatistics(userWins, computerWins, games);

        System.out.println("\nPlayer\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }

        sc.close();
    }
}