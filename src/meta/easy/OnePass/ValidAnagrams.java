package meta.easy.OnePass;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        //both needs to be of same length if valid anagram
        if (s.length() != t.length()) {
            return false;
        }
        int len = t.length();
        //map to store char and char count
        Map<Character, Integer> map = new HashMap<>();
        //keep incrementing count if exists in first and keep deleting is exists in second so that we get all count as 0 if valid
        for (int index = 0; index < len; index++) {
            char sChar = s.charAt(index);
            char tChar = t.charAt(index);
            map.put(sChar, map.getOrDefault(sChar, 0) + 1);
            map.put(tChar, map.getOrDefault(tChar, 0) - 1);
        }
        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }/*
    TIME & SPACE COMPLEXITY
    Metric	Value
    Time Complexity	O(n)
    Space Complexity	O(1) (at most 26 keys if only lowercase letters)*/
}
