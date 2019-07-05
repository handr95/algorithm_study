package array;

import java.util.HashMap;
import java.util.Map;

/**
 * 배열과 문자열
 *
 * 1.4 회문 순열
 * 주어진 문가열이 회문(palindrome)의 순열인지 아닌지 확인하는 함수를 작성하라.
 * 회문이란 앞으로 읽으나 뒤로 읽으나 같은 단어 혹은 구정릉 의미하며, 순열이란 문자열을 재배치하는 것을 뜻한다.
 * 회문이 꼭 사전에 등장하는 단어로 제한될 필요는 없다.
 */
public class CircularPermutationCheck {
    public boolean circular_permutation_check(String a) {
        char[] chars = a.toCharArray();
        Map<String, Integer> integerMap = new HashMap<>();
        for (char c : chars) {
            if (c == ' ') {
                continue;
            }
            integerMap.put(String.valueOf(c).toUpperCase(), integerMap.getOrDefault(String.valueOf(c).toUpperCase(), 0) + 1 );
        }

        int i = a.length() % 2 == 0 ? 0 : 1;
        for (Integer value : integerMap.values()) {
            if (i < 0) {
                return false;
            }
            if (value % 2 == 1) {
                i --;
            }
        }

        return true;
    }
}
