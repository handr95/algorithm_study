package math;

/**
 * 6. ZigZag Conversion (https://leetcode.com/problems/zigzag-conversion/)
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || s.length() < numRows || numRows < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int[][] zigzagIdx = new int[numRows][chars.length];

        int flag = 1;
        zigzagIdx[0][0] = 0;
        int count = 1;
        for (int i = 1; i < chars.length; i ++) {
            if (count == numRows - 1 || count == 0) {
                flag *= -1;
            }
            zigzagIdx[count][i] = i;
            count += flag;
        }

        String result = String.valueOf(chars[0]);
        for (int i = 0; i < numRows; i++) {
            for (int idx : zigzagIdx[i]) {
                if (idx != 0) {
                    result += chars[idx];
                }
            }
        }

        return result;
    }
}
