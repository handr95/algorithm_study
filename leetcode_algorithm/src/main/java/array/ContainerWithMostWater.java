package array;

/**
 * 11. Container With Most Water (https://leetcode.com/problems/container-with-most-water/)
 *
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * non-negative : 음수가 아닌 정수
 * represents : 대표하다.
 * coordinate : 조직화하다, 편성하다
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 *
 *
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 *
 *
 *
 * Example:
 *
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i =0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j ++) {
                int area;
                if (height[i] >= height[j]) {
                    area = (j - i) * height[j];
                } else {
                    area = (j - i) * height[i];
                }

                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
