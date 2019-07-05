package binarysearch;

/**
 * 34. Find First and Last Position of Element in Sorted Array (https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for (int i =0; i < nums.length; i ++) {
            if (nums[i] > target) {
                break;
            }

            if (nums[i] == target){
                result[0] = i;
                break;
            }
        }

        if (result[0] == -1) {
            return result;
        }

        for (int i = nums.length - 1; i >= 0; i --) {
            if (nums[i] < target) {
                break;
            }

            if (nums[i] == target){
                result[1] = i;
                break;
            }
        }

        return result;
    }
}
