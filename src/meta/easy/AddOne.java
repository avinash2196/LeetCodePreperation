package meta.easy;

public class AddOne {
    public int[] plusOne(int[] digits) {
        for (int index = digits.length - 1; index >= 0;index--) {
            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            }
            digits[index] = 0;
        }
        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
  /*  Time and Space Complexity:
    Time Complexity: O(n) – You may iterate through all digits.

    Space Complexity: O(n) – Only in the edge case where all digits are 9 (new array of size n + 1).*/
}
