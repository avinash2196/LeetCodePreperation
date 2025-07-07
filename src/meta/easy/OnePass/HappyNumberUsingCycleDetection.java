package meta.easy.OnePass;

public class HappyNumberUsingCycleDetection {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = nextGen(n);
        //stop if cycle detected or fast is 1 as expected
        while (fast != 1 && fast != slow) {
            slow = nextGen(slow);
            fast = nextGen(nextGen(fast));
        }
        return fast == 1;
    }

    private int nextGen(int n) {
        int res = 0;
        while (n != 0) {
            int digit = n % 10;
            res += digit * digit;
            n = n / 10;
        }
        return res;
    }
}
