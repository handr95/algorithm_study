/**
 * 
 */

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import crawing.WikiFetcher;
import indexing.TermCounter;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

/**
 * @author downey
 *
 */
public class TermCounterTest {

	private TermCounter counter;

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		
		WikiFetcher wf = new WikiFetcher();
		Elements paragraphs = wf.readWikipedia(url);
		
		counter = new TermCounter(url.toString());
		counter.processElements(paragraphs);
	}

	@Test
	public void testSize() {
		assertThat(counter.size(), is(4798));
	}
}
