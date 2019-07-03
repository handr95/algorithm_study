package array;

/**
 * 배열과 문자열
 * 1.1 중복이 없는가
 * 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
 * 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
 */
public class DuplicationCheck {
    public boolean duplicationCheck(String s) {
        char[] chars = s.toCharArray(); //문자열은 문자 배열로 변환한다.
        for (int i = 0; i < s.length() - 1; i ++) { // 문자 배열을 첫번째 인덱스 부터 돌면서 현재 문자와 다음 문자가 같은지 비교한다.
            if(chars[i] == chars[i + 1]) {  //같은게 있다면 true 반환
                return true;
            }
        }
        return false;   //없다면 false 반환
    }

    /**
     * 0(n)
     * @param str ASCII 문자열이라 가정
     * @return
     */
    public boolean solutionIsUniqueChars1(String str) {
        if (str.length() > 128) return false;   //ascii는 0~127까지 고유 값이 활당되어있음.
        boolean[] char_set = new boolean[128];
        for (int i =0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    /**
     *
     * @param str : a~z로 구성되어 있는 문자열이라 가정
     * @return
     */
    public boolean solutionIsUniqueChars2(String str) {
        int checker = 0;
        for (int i =0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
