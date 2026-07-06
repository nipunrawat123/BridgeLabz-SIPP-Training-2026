import java.util.Scanner;

public class ShortestLongestWord {
    static String[] splitWords(String text) {
        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];
        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                result[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return result;
    }

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    static String[][] getWordLength(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    static int[] findShortestLongest(String[][] data) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < Integer.parseInt(data[shortest][1])) {
                shortest = i;
            }

            if (len > Integer.parseInt(data[longest][1])) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = getWordLength(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word = " + data[result[0]][0]);
        System.out.println("Longest Word = " + data[result[1]][0]);

        sc.close();
    }
}