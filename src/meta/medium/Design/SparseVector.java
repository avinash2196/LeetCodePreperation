package meta.medium.Design;

import java.util.HashMap;
import java.util.Map;

class SparseVector {
    //only store non-zero elements against their indices
    Map<Integer, Integer> map;

    SparseVector(int[] nums) {
        map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                map.put(index, nums[index]);
            }
        }
    }

    //multiply if both has values as same index ie, key is present is both maps
    public int dotProduct(SparseVector vec) {
        int result = 0;
        Map<Integer, Integer> small = this.map.size() < vec.map.size() ? this.map : vec.map;
        Map<Integer, Integer> large = this.map.size() < vec.map.size() ? vec.map : this.map;

        for (int key : small.keySet()) {
            if (large.containsKey(key)) {
                result += small.get(key) * large.get(key);
            }
        }
        return result;
    }
/*  Time and Space Complexity
    Operation	Complexity
    Constructor	O(n) (n = length of input array)
    dotProduct	O(k) where k = number of non-zero elements in smaller vector
    Space	O(k) where k = number of non-zero elements*/
}
