package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        if (nums.length < 3) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int biggest = 0;
        int biggestIdx = 0;
        for (Integer key : map.keySet()) {
            if (biggest < map.get(key)) {
                biggest = map.get(key);
                biggestIdx = key;
            }
        }
        return biggestIdx;
    }
}
