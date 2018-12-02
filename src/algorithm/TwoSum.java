package algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        final int[] result = {-1, -1};
        if(nums == null || nums.length < 2) { return result; }
        final Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i) {
            final int complement = target - nums[i];
            if(map.containsKey(complement)) { return new int[] {map.get(complement), i}; }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Invalid Input");
    }
}
