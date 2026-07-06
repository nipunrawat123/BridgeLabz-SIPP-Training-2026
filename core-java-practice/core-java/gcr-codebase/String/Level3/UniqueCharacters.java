import java.util.Scanner;

public class UniqueCharacters {
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

    static char[] findUniqueCharacters(String text) {
        int length = findLength(text);

        char[] temp = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[index++] = text.charAt(i);
            }
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);

        System.out.print("Unique Characters: ");

        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}