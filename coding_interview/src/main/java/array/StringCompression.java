package array;

/**
 * 배열과 문자열
 *
 * 1.6 문자열 압축
 * 반복되는 문자의 개수를 세는 방식의 기본적인 무자열 압축 메서드를 작성하라.
 * 예를 들어 문자열 aabccccaaa를 압축하면 a2b1c5a3이 된다.
 * 만약 '압축된' 문자열의 길이가 기존 문자열의 길이보다 길다면 기존 문자열을 반환해야 한다.
 * 문자열은 대소문자 알파벳(a~z)으로만 이루어져 있다.
 */
public class StringCompression {
    public String string_compression(String a) {
        String result = "";

        char first = a.charAt(0);
        int count = 1;
        for (int i = 1; i < a.length(); i ++) {
            if (first == a.charAt(i)) {
                count++;
            } else {
                result += String.valueOf(a.charAt(i - 1)) + count;
                count = 1;
                first = a.charAt(i);
            }
        }

        result += String.valueOf(a.charAt(a.length() - 1)) + count;
        return result;
    }
}
