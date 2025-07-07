package meta.easy.OnePass;

public class SingleNumberInConstantSpace {
    public int singleNumber(int[] nums) {
        int xor = 0;
        //use xor: a^a=0 , a^0=a , a^a^b=b
        for (int index = 0; index < nums.length; index++) {
            xor = xor ^ nums[index];
        }
        return xor;
    }/*
    Complexity
    Metric	Value
    Time	O(n)
    Space	O(1)*/
}
