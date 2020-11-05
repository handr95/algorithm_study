package array;

/**
 * 283. Move Zeroes (https://leetcode.com/problems/move-zeroes/)
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
        int idx = 0;
        while(idx != nums.length - 1){
            if (nums[idx] == 0) {
                switchIdx(nums, idx);
            } else {
                idx ++;
            }
        }
        return nums;
    }

    public void switchIdx(int[] nums, int idx) {
        int temp = nums[idx];
        nums[idx] = nums[idx + 1];
        nums[idx+1] = temp;
    }
}
