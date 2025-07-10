package meta.medium.TwoPointer;

public class MaximumSwap {
    public int maximumSwap(int num) {
        //convert it into char array to easily process
        char[] digits = Integer.toString(num).toCharArray();
        //use two swap counters to find digits to be swapped
        int swapIndex1 = -1;
        int swapIndex2 = -1;
        int maxDigitIndex = digits.length - 1;
        for (int index = digits.length - 2; index >= 0; index--) {
            //find maxDigitIndex from last
            if (digits[index] > digits[maxDigitIndex]) {
                maxDigitIndex = index;
            } else if (digits[index] < digits[maxDigitIndex]) {
                swapIndex1 = index;
                swapIndex2 = maxDigitIndex;
            }
        }
        if (swapIndex1 != -1) {
            char temp = digits[swapIndex1];
            digits[swapIndex1] = digits[swapIndex2];
            digits[swapIndex2] = temp;
        }
        return Integer.parseInt(new String(digits));
    }
/*    Time & Space Complexity
    Metric	Complexity
    Time	O(n)
    Space	O(n)*/
}
