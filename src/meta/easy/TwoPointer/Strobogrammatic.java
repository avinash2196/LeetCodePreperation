package meta.easy.TwoPointer;

import java.util.Map;

public class Strobogrammatic {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = Map.of('0', '0', '1', '1', '6', '9', '8', '8', '9', '6');
        int left = 0;
        int right = num.length() - 1;
        while (left <= right) {
            char l = num.charAt(left++);
            char r = num.charAt(right--);
            if (!map.containsKey(l) || map.get(l) != r) {
                return false;
            }
        }
        return true;
    }
/*    TIME & SPACE COMPLEXITY
    Metric	Value
    Time	O(n)
    Space	O(1) (map has 5 entries)*/
}
