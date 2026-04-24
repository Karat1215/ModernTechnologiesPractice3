package part2.part2_3;

public class StringProcessor {

    // Подсчёт гласных (русские + английские)
    public static int countVowels(String text) {
        String vowels = "аеёиоуыэюяaeiouyАЕЁИОУЫЭЮЯAEIOUY";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    // Проверка на палиндром (без учёта регистра и знаков препинания)
    public static boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^а-яa-z0-9]", "");
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Реверс строки (без StringBuilder)
    public static String reverse(String text) {
        char[] chars = text.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    // Самое длинное слово
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("[ .,!?;:-]+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "Привет, Java-разработчик!",
                "топот",
                "Madam",
                "hello",
                "А роза упала на лапу Азора",
                "The quick brown fox jumps over the lazy dog"
        };

        System.out.println("=== Гласные ===");
        for (String s : testStrings) {
            System.out.println("\"" + s + "\" -> гласных: " + countVowels(s));
        }

        System.out.println("\n=== Палиндромы ===");
        for (String s : testStrings) {
            System.out.println("\"" + s + "\" -> " + (isPalindrome(s) ? "палиндром" : "не палиндром"));
        }

        System.out.println("\n=== Реверс ===");
        for (String s : testStrings) {
            System.out.println("\"" + s + "\" -> \"" + reverse(s) + "\"");
        }

        System.out.println("\n=== Самое длинное слово ===");
        for (String s : testStrings) {
            System.out.println("\"" + s + "\" -> \"" + findLongestWord(s) + "\"");
        }
    }
}