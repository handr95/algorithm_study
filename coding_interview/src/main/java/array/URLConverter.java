package array;

/**
 * 배열과 문자열
 *
 * 1.3 URL화
 * 문자열에 들어 있는 모든 공백을 '%20'바꿔 주는 메서드를 작성하라.
 * 최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보되어 있으며 문자열의 최종 길이가 함께 주어진다고 가정해도된다.
 * (자바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열을 이용하길 바란다.)
 */
public class URLConverter {
    public String urlConverter(String url) {
        char[] chars = url.toCharArray();
        String convertURL = "";
        for(int i = 0; i < chars.length; i ++){
            if(chars[i] == ' ') {
                convertURL += "%20";
            } else {
                convertURL += chars[i];
            }
        }

        return convertURL;
    }
}
