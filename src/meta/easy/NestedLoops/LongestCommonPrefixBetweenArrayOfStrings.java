package meta.easy.NestedLoops;

public class LongestCommonPrefixBetweenArrayOfStrings {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";

        //iterate on chars of first string
        for(int charIndex=0;charIndex<strs[0].length();charIndex++){
            char charFromFirstString=strs[0].charAt(charIndex);
            //iterate over all chars of other strings and validate it against the chars from first string
            for(int wordIndex=1; wordIndex<strs.length;wordIndex++){
                if(strs[wordIndex].length()==charIndex || strs[wordIndex].charAt(charIndex)!=charFromFirstString){
                    return strs[0].substring(0,charIndex);
                }
            }
        }
        //since all matches return first string
        return strs[0];
    }
}
