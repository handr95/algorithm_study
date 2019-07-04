package array;

/**
 * 배열과 문자열
 *
 * 1.5 하나 빼기
 * 문자열을 편집하는 방법에는 세 가지 종류가 있다. 문자 삽입, 문자 삭제, 문자 교체, 문자열 두 개가 주어졌을 때,
 * 문자열을 같게 만들기 위한 편집 횟수가 1회 이내인지 확인하는 함수를 작성하라.
 */
public class SubtractOne {
    public boolean subtract_one(String a, String b) {
        if (a.length() - b.length() < -1 || a.length() - b.length() > 1 ) {
            return false;
        }

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        if (charsA.length == charsB.length) {
            return equalSizeOneEditCheck(charsA, charsB);
        } else if(charsA.length > charsB.length) {
            return nonEqualSizeOneEditCheck(charsA, charsB);
        } else if(charsA.length < charsB.length) {
            return nonEqualSizeOneEditCheck(charsB, charsA);
        }

        return true;
    }

    public boolean equalSizeOneEditCheck(char[] a, char[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i ++) {
            if (a[i] != b[i]) {
                count ++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean nonEqualSizeOneEditCheck(char[] a, char[] b) {
        int count = 0;
        int idx = 0;
        for (int i = 0; i < a.length; i ++) {
            if (idx > b.length - 1) {
                idx--;
            }

            if (a[i] != b[idx]) {
                count++;
                idx--;
            }
            if (count > 1) {
                return false;
            }
            idx++;
        }
        return true;
    }
}
