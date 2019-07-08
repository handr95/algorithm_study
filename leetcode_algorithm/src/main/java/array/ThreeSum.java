package array;

import java.util.*;

/**
 * 15. 3Sum (https://leetcode.com/problems/3sum/)
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * Accepted
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j =  i + 1; j < nums.length - 1; j++) {
                for (int k =  j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> sumList = new ArrayList<>();
                        sumList.add(nums[i]);
                        sumList.add(nums[j]);
                        sumList.add(nums[k]);
                        sumList.sort(Comparator.naturalOrder());
                        if (!result.contains(sumList))
                            result.add(sumList);
                    }
                }
            }
        }

        return result;
    }
}
