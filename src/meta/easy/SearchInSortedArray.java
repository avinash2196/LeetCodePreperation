package meta.easy;

public class SearchInSortedArray {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left=0;
            int right=nums.length-1;
            while(left<=right){
                int pivot=left+(right-left)/2;
                if(nums[pivot]==target){
                    return pivot;
                }else if(nums[pivot]>target){
                    right=pivot-1;
                }else{
                    left=pivot+1;
                }
            }
            return left;
        }
    }
/*    Time and Space Complexity:
    Time Complexity: O(log n) – Binary search.

    Space Complexity: O(1) – Constant space.*/
}
