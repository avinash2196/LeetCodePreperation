package meta.easy.OnePass;

public class RangeSumQuery {
    private int[] sum;

    public RangeSumQuery(int[] nums) {
        sum = new int[nums.length + 1];
        for (int index = 0; index < nums.length; index++) {
            //sum at i+1 contains sum till i elements
            sum[index + 1] = sum[index] + nums[index];
        }
    }

    public int sumRange(int left, int right) {
        return sum[right + 1] - sum[left];
    }
   /* Time and Space Complexity
    Operation	Time Complexity	Space Complexity
    Constructor	O(n)	O(n)
    sumRange()	O(1)	–*/
}
