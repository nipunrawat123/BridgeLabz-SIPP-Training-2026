import java.util.*;

public class SpyAgency {

    public static void main(String[] args) {

        String message = "madam";
        String reversed = new StringBuilder(message).reverse().toString();
        System.out.println("Reversed Message: " + reversed);
        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        int vowels = 0, consonants = 0;

        for (char ch : message.toLowerCase().toCharArray()) {

            if (Character.isLetter(ch)) {

                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        String intercept1 = "listen";
        String intercept2 = "silent";

        if (isAnagram(intercept1, intercept2)) {
            System.out.println(intercept1 + " and " + intercept2 + " are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        String log = "swiss";

        Character result = firstNonRepeating(log);

        if (result != null) {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static Character firstNonRepeating(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}