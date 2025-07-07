package meta.easy.OnePass;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dict = new HashSet();
        for (int num : nums) {
            if (dict.contains(num)) return true;
            else dict.add(num);
        }
        return false;
    }
    /*    Time and Space Complexity
    Metric	Value
    Time	O(n)
    Space	O(n)*/
}
