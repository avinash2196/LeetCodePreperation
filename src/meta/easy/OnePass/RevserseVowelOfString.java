package meta.easy.OnePass;

import java.util.Set;

public class RevserseVowelOfString {
    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !set.contains(chars[left])) {
                left++;
            }
            while (left < right && !set.contains(chars[right])) {
                right--;
            }
            swap(chars, left, right);
            left++;
            right--;
        }
        return new String(chars);
    }

    private void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
/*    Time & Space Complexity
    Operation	Complexity
    Time	O(n)
    Space	O(n)*/
}
