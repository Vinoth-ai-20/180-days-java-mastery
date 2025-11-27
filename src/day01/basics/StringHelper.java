package day01.basics;

public class StringHelper {
    public boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase().replaceAll(" ", "");
        String reversed = reversedString(cleaned);
        return cleaned.equals(reversed);
    }

    public String reversedString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int countVowel(String str) {
        int count = 0;
        String lowerCase = str.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String trimmed = str.trim();
        return trimmed.split(" ").length;
    }

}
