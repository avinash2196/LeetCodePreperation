package meta.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap();
        for (String str : strs) {
            Map<Character, Integer> countMap = new HashMap();
            for (char ch : str.toCharArray()) {
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
            }
            String key = generateKey(countMap);
            ans.computeIfAbsent(key, k -> new ArrayList()).add(str);
        }
        return new ArrayList<>(ans.values());
    }

    private String generateKey(Map<Character, Integer> countMap) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append('#').append(countMap.getOrDefault(ch, 0)).append('#');
        } return sb.toString();
    }
}
// Time complexity :O(n*k) --k-->max length of string
// Space Complexity :O(n*k)