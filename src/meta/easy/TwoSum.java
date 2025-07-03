    package meta.easy;

    import java.util.Arrays;
    import java.util.Comparator;
    import java.util.HashMap;
    import java.util.Map;

    public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> countMap=new HashMap<>();
            for(int index=0;index<nums.length;index++){
                int num=nums[index];
                if(countMap.containsKey(target-num)){
                   return new int[]{index,countMap.get(target-num)};
                }else{
                    countMap.put(num,index);
                }
                }
            return new int[2];
            }
        //O(n)
        public int[] twoSum2(int[] nums, int target) {
            int [][] numArr=new int[nums.length][2];
            for(int i=0;i<nums.length;i++){
                numArr[i][0]=nums[i];
                numArr[i][1]=i;
            }
            Arrays.sort(numArr,(a,b)->Integer.compare(a[0],b[0]));
           for(int i=0;i<numArr.length-1;i++) {
               int left = i + 1, right = numArr.length - 1;
               int complement = target - numArr[i][0];
               while (left <= right) {
                   int mid = left + (right - left) / 2;
                   if (numArr[mid][0] == complement) {
                       return new int[]{numArr[i][1], numArr[mid][1]};
                   } else if (numArr[mid][0] < complement) {
                       left = mid+1;
                   } else {
                       right = mid - 1;
                   }
               }
           }
            return new int[2];
        }
        //O(n log n)
    }
