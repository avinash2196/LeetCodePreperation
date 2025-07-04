package meta.easy.OnePass;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //start from last as it will allow single pass by just using highest numbers at last
        int num1Index = m - 1;
        int num2Index = n - 1;
        int finalIndex = m + n - 1;
        while (num2Index >= 0) {
            if (num1Index >= 0 && nums1[num1Index] > nums2[num2Index]) {
                nums1[finalIndex--] = nums1[num1Index--];
            } else {
                nums1[finalIndex--] = nums2[num2Index--];
            }
        }
    }
/*    Time and Space Complexity
    Metric	Value	Reason
    Time Complexity	O(m + n)	One pass through both arrays
    Space Complexity	O(1)	In-place, no extra memory*/
}
