package meta.easy.OnePass;

public class AddBinaryStrings {
    public String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int aIndex = aLen;
        int bIndex = bLen;
        int carry = 0;
        while (aIndex >= 0 || bIndex >= 0 || carry == 1) {
            int digit1 = aIndex >= 0 ? a.charAt(aIndex--) - '0' : 0;
            int digit2 = bIndex >= 0 ? b.charAt(bIndex--) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
/*    Time and Space Complexity
    Complexity	Value	Reason
    Time	O(max(n, m))	You loop through both strings once (n = length of a, m = length of b)
    Space	O(max(n, m))	Output string size is at most max(n, m) + 1 (in case of extra carry)*/
}
