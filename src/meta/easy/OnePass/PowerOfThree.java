package meta.easy.OnePass;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
/*    Time & Space Complexity
    Operation	Time Complexity	Space Complexity
    isPowerOfThree	O(log₃(n))	O(1)*/
}
