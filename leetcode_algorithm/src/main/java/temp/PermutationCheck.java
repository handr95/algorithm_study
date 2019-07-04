package temp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 배열과 문자열
 * 1.2 순열 확인
 * 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라.
 *
 * 순열 : 서로 다른 n개의 원소에서 r개를 중복없이 골라 순서에 상관있게 나열하는 것을 n개에서 r개를 택하는 순열이라고 한다
 */
public class PermutationCheck {
    public boolean permutation_check(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        if (sortString(a).equals(sortString(b))) {
            return true;
        }

        return false;
    }

    public String sortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}