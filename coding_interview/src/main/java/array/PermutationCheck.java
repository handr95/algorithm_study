package array;

import java.util.Arrays;

/**
 * 배열과 문자열
 * 1.2 순열 확인
 * 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라.
 *
 * 순열 : 서로 다른 n개의 원소에서 r개를 중복없이 골라 순서에 상관있게 나열하는 것을 n개에서 r개를 택하는 순열이라고 한다
 */
public class PermutationCheck {
    public boolean permutation_check(String a, String b) {
        if (a.length() != b.length()) { //문자열이 길이가 다르다면 순열관계가 아님
            return false;
        }

        return sortString(a).equals(sortString(b)); //문자열 정열 후 동일한지 비교
    }

    public String sortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }


    /**
     *
     * @param a ascii 사용한다 가정
     * @param b ascii 사용한다 가정
     * @return
     */
    public boolean permutation_check_solution(String a, String b) {
        if (a.length() != b.length()) { //문자열이 길이가 다르다면 순열관계가 아님
            return false;
        }

        int[] letters = new int[128];

        char[] s_Array = a.toCharArray();
        for(char c : s_Array) { //s 내에서 각 문자열의 출연 횟수를 센다.
            letters[c] ++;
        }

        for (int i = 0; i < b.length(); i ++) {
            int c = (int) b.charAt(i);
            letters[c]--;
            if(letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
