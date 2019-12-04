package math;

/**
 * 7. Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 *
 * assume : 추정(상정)하다, 캍다, 따다(취하다)
 * overflows : 넘치다
 */
public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0 ){
            return 0;
        }
        String parseX = String.valueOf(x);
        char[] parseXChar = parseX.toCharArray();
        boolean negative = false;
        String result = "";
        for (int i = parseXChar.length - 1; i >= 0; i--) {
            if (parseXChar[i] == '-') {
                negative = true;
                continue;
            }
            result += parseXChar[i];
        }

        try {
            if (Integer.MAX_VALUE < Integer.parseInt(result) || Integer.parseInt(result) < Integer.MIN_VALUE) {
                return 0;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        return negative == true ? Integer.parseInt(result) * -1 : Integer.parseInt(result);
    }
}
