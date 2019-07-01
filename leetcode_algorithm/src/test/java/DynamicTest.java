import org.junit.Test;

import dynamic.LongestPalindrome;
import dynamic.RegularExpressionMatchiing;

import static org.assertj.core.api.Assertions.assertThat;

public class DynamicTest {

    @Test
    public void longest_palindrome() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        assertThat(longestPalindrome.longestPalindrome("babad")).isEqualTo("bab");
        assertThat(longestPalindrome.longestPalindrome("cbbd")).isEqualTo("bb");
        assertThat(longestPalindrome.longestPalindrome("ccc")).isEqualTo("ccc");
    }

    @Test
    public void regular_expression_matching_test() {
        RegularExpressionMatchiing regularExpressionMatchiing = new RegularExpressionMatchiing();
        assertThat(regularExpressionMatchiing.isMatch("aa", "a")).isFalse();
        assertThat(regularExpressionMatchiing.isMatch("aa", "a*")).isTrue();
        assertThat(regularExpressionMatchiing.isMatch("ab", ".*")).isTrue();
        assertThat(regularExpressionMatchiing.isMatch("aab", "c*a*b")).isTrue();
        assertThat(regularExpressionMatchiing.isMatch("mississippi", "mis*is*p*.")).isFalse();
    }
}
