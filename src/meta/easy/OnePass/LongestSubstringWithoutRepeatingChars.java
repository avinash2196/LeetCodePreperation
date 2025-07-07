package meta.easy.OnePass;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap();
        int startIndex = 0;
        int currIndex = 0;
        while (currIndex < s.length()) {
            char ch = s.charAt(currIndex);
            if (map.containsKey(ch)) {
                startIndex = Math.max(startIndex, map.get(ch) + 1);
            }
            result = Math.max(result, currIndex - startIndex + 1);
            map.put(ch, currIndex);
            currIndex++;
        }
        return result;
    }
   /*    Time and Space Complexity
    Metric	Value
    Time	O(n)
    Space	O(k) --Where k is the number of unique characters in the string (max 128 for ASCII).
	*/
}
