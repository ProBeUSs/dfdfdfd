import java.util.*;

public class Main {

    // Завдання 1: Перевірка паліндрома
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Завдання 2: Кількість голосних у рядку
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // Завдання 3: Реверс рядка
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Завдання 4: Перевірка порожнього рядка
    public static boolean isEmptyOrWhitespace(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Завдання 5: Підрахунок літер у рядку
    public static int countLetters(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

    // Завдання 6: Повторення рядка
    public static String repeatString(String str, int times) {
        return str.repeat(times);
    }

    // Завдання 7: Перевірка початку і кінця
    public static boolean startsAndEndsWith(String str, char start, char end) {
        return str.startsWith(String.valueOf(start)) && str.endsWith(String.valueOf(end));
    }

    // Завдання 8: Видалення пробілів
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }

    // Завдання 9: Дублювання кожного символу
    public static String duplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            result.append(ch).append(ch);
        }
        return result.toString();
    }

    // Завдання 10: Заміна цифр на зірочки
    public static String replaceDigitsWithStars(String str) {
        return str.replaceAll("\\d", "*");
    }

    // Завдання 11: Перевірка анаграми
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // Завдання 12: Стиснення рядка
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    // Завдання 13: Знайти найдовший спільний підрядок
    public static String longestCommonSubstring(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return str1.substring(endIndex - maxLength, endIndex);
    }

    // Метод main для тестування всіх функцій
    public static void main(String[] args) {
        System.out.println("Завдання 1: Перевірка паліндрома - 'madam': " + isPalindrome("madam")); // true
        System.out.println("Завдання 2: Кількість голосних - 'hello world': " + countVowels("hello world")); // 3
        System.out.println("Завдання 3: Реверс рядка - 'Java': " + reverseString("Java")); // "avaJ"
        System.out.println("Завдання 4: Порожній рядок - '   ': " + isEmptyOrWhitespace("   ")); // true
        System.out.println("Завдання 5: Кількість літер - '123abc!': " + countLetters("123abc!")); // 3
        System.out.println("Завдання 6: Повторення рядка - 'Hi', 3: " + repeatString("Hi", 3)); // "HiHiHi"
        System.out.println("Завдання 7: Початок і кінець - 'hello', 'h', 'o': " + startsAndEndsWith("hello", 'h', 'o')); // true
        System.out.println("Завдання 8: Видалення пробілів - 'Hello World': " + removeSpaces("Hello World")); // "HelloWorld"
        System.out.println("Завдання 9: Дублювання символів - 'abc': " + duplicateCharacters("abc")); // "aabbcc"
        System.out.println("Завдання 10: Заміна цифр - 'hello123': " + replaceDigitsWithStars("hello123")); // "hello***"
        System.out.println("Завдання 11: Анаграмма - 'listen', 'silent': " + areAnagrams("listen", "silent")); // true
        System.out.println("Завдання 12: Стиснення - 'aabcccccaaa': " + compressString("aabcccccaaa")); // "a2b1c5a3"
        System.out.println("Завдання 13: Найдовший підрядок - 'abcdef', 'zbcdf': " + longestCommonSubstring("abcdef", "zbcdf")); // "bcd"
    }
}
// echo "# dfdfdfd" >> README.md
// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/ProBeUSs/dfdfdfd.git
// git push -u origin main