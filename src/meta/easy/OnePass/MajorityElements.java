package meta.easy.OnePass;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int count = 0;
        //iterate over array and keep incrementing count if its matches majorityElement else decrement
        for (int num : nums) {
            //set majority if count ==0
            if (count == 0) {
                majorityElement = num;
            }
            count += majorityElement == num ? 1 : -1;
        }
        return majorityElement;
    }

    // Time complexity :O(n)
    // Space Complexity :O(1)
}
