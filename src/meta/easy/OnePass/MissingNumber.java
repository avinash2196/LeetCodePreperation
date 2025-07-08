package meta.easy.OnePass;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        //num xor num =0
        int missing = nums.length;//as only one missing so nums.length will always be max number
        for (int index = 0; index < nums.length; index++) {
            missing = missing ^ nums[index] ^ index;
        }
        return missing;
    }
/*    TIME & SPACE COMPLEXITY
    Metric	Value
    Time	O(n)
    Space	O(1)*/
}
