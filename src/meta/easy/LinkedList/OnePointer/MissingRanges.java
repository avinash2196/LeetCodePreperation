package meta.easy.LinkedList.OnePointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        int len = nums.length;
        List<List<Integer>> result = new ArrayList();
        if (len == 0) {
            result.add(Arrays.asList(lower, upper));
            return result;
        }
        if (lower < nums[0]) {
            result.add(Arrays.asList(lower, nums[0] - 1));
        }
        for (int index = 1; index < len; index++) {
            if (nums[index] - nums[index - 1] > 1) {
                result.add(Arrays.asList(nums[index - 1] + 1, nums[index] - 1));
            }
        }
        if (nums[len - 1] < upper) {
            result.add(Arrays.asList(nums[len - 1] + 1, upper));
        }
        return result;
    }
/*    Time and Space Complexity
    Metric	Value
    Time Complexity	O(n)
    Space Complexity	O(n)*/
}
