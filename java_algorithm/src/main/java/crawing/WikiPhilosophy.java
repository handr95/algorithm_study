package crawing;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class WikiPhilosophy {

    final static List<String> visited = new ArrayList<String>();
    final static WikiFetcher wf = new WikiFetcher();

    /**
     * Tests a conjecture about Wikipedia and Philosophy.
     *
     * https://en.wikipedia.org/wiki/Wikipedia:Getting_to_Philosophy
     *
     * 1. Clicking on the first non-parenthesized, non-italicized link
     * 2. Ignoring external links, links to the current page, or red links
     * 3. Stopping when reaching "Philosophy", a page with no links or a page
     *    that does not exist, or when a loop occurs
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String destination = "https://en.wikipedia.org/wiki/Philosophy";
        String source = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        testConjecture(destination, source, 10);
    }

    /**
     * Starts from given URL and follows first link until it finds the destination or exceeds the limit.
     *
     * @param destination
     * @param source
     * @throws IOException
     */
    public static void testConjecture(String destination, String source, int limit) throws IOException {
        //4. 그렇지 않으면 다시 1단계로 돌아갑니다.
        for (int i =0; i < limit; i ++) {
            //3. 페이지에 링크가 없거나 첫 번째 링크가 이미 본 페이지라면 프로그램은 실패를 표시하고 종료
            if (source == null) {
                System.out.println("link is null");
                return;
            } else if(visited.contains(source)) {
                System.out.println("link already reached");
                return;
            }

            //1. 위키피디아 페이지의 url을 가져와서 페이지를 다운로드하고 파싱한다. 링크는 사이드바 또는 박스아웃이 아닌 페이지 본문에 있어야합니다.
            Elements elements = wf.fetchWikipedia(source);

            //2. 결과 DOM 트리를 탐색하여 첫번째 유효한 노드를 찾습니다.
            WikiParser wikiParser = new WikiParser(elements);

            Element element = wikiParser.findFirstLink();
            source = "https://en.wikipedia.org" + element.attributes().get("href");
            visited.add(source);

            System.out.println("source : '" + source + "'");

            if (source.equals(destination)) {
                return;
            }
        }
    }

}
