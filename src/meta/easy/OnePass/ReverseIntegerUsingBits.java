package meta.easy.OnePass;

public class ReverseIntegerUsingBits {
    public int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            //move re to left
            ret <<= 1;
            //perform and to find last significant digit
            ret |= n & 1;
            //move right to shift most significant digit
            n >>= 1;
        }
        return ret;
    }
  /*  Time & Space Complexity
    Aspect	Value
    Time Complexity	O(32) = O(1)
    Space Complexity	O(1)*/
}

