package meta.easy.OnePass;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Map<Character,Character> charMap=new HashMap();
        charMap.put(')','(');
        charMap.put('}','{');
        charMap.put(']','[');
        Stack<Character> stack=new Stack();
        for(int index=0;index<s.length();index++){
            char currSymbol=s.charAt(index);
            if(charMap.containsKey(currSymbol)){
                char topElement=stack.isEmpty()?'#':stack.pop();
                char expectedElement=charMap.get(currSymbol);
                if(topElement!=expectedElement){
                    return false;
                }
            }else{
                stack.push(currSymbol);
            }
        }
        return stack.isEmpty();
    }
    // Time complexity :O(n)
    // Space Complexity :O(n)
}
