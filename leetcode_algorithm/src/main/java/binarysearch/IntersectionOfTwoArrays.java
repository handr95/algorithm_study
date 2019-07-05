package binarysearch;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays (https://leetcode.com/problems/intersection-of-two-arrays/)
 * Intersection : 교차로, 교차 지점
 * Given two arrays, write a function to compute their intersection.
 * compute 1. [격식]계산[산출]하다
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashMap = new HashSet<>();
        for (int num1 : nums1) {
            hashMap.add(num1);
        }

        HashSet<Integer> list = new HashSet<>();

        for (int num2 : nums2) {
            if (hashMap.contains(num2)) list.add(num2);
        }


        int[] result = new int[list.size()];
        int idx = 0;
        for (Object val : list.toArray()) {
            result[idx++] = (int) val;
        }


        return result;
    }
}
