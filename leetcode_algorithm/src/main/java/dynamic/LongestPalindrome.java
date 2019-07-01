package dynamic;

/**
 * 5. Longest Palindromic Substring (https://leetcode.com/problems/longest-palindromic-substring/solution/)
 * Palindromic : 앞뒤가 같은
 *
 * Share
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String result = "";
        char[] chars = s.toCharArray();

        if (chars.length == 0) {
            return "";
        }

        for (int i = chars.length; i > 0 ; i--) {
            for (int j = 0 ; j < chars.length - i; j ++) {
                String palindrome = palindromeCheck(chars, j, i+j);
                if (!palindrome.equals("")) {
                    return palindrome;
                }
            }
        }

        if (result.equals("")) {
            return String.valueOf(chars[0]);
        }

        return result;
    }

    public String palindromeCheck(char[] s, int min, int max) {
        int i = 0;
        while (i != max - min + 1) {
            if (s[min + i] == s[max - i]) {
                i ++;
            } else {
                return "";
            }
        }

        String result = "";
        for (int j = min; j <=max; j ++) {
            result += s[j];
        }

        return result;
    }
}