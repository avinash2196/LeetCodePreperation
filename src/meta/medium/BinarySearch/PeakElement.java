package meta.medium.BinarySearch;

public class PeakElement {
    //since number starts from -infinity so first elemet is always greater hence we start by checking only next element
    //if we move to next that means first element is smaller and so on so we need to check only next element always
    //in case of binary search , if mid is greater than mid+1 that means we are on decreaing slope so our element lies on left
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
// Time complexity : O(log n)
// Space Complexity :O(1)