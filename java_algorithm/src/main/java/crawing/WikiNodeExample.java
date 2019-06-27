package crawing;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class WikiNodeExample {
	
	public static void main(String[] args) throws IOException {
		String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		

		Connection conn = Jsoup.connect(url); // 웹서버 접속
		Document doc = conn.get();	// html을 다운로드하여 파싱하고 dom 트리를 나타내는 document 객체를 반환
		
		// 내용을 선택하고 단락 추출
		// 모든 위키피디아 페이지에서 페이지 본문을 포함한 <div> 요소를 식별하게함
		// 하위에 있는 자식과 손자 요소들의 참조를 포함
		Element content = doc.getElementById("mw-content-text");	//일치하는 id 필드를 갖는 요소를 트리에서 찾음
		Elements paras = content.select("p");	//param과 일치하는 태그를 가진 모든 요소를 반환함
		Element firstPara = paras.get(0);
		
		recursiveDFS(firstPara);
		System.out.println();

		iterativeDFS(firstPara);
		System.out.println();

		Iterable<Node> iter = new WikiNodeIterable(firstPara);
		for (Node node: iter) {
			if (node instanceof TextNode) {
				System.out.print(node);
			}
		}
	}

	/**
	 * 인자인 root를 탐색하려는 트리의 루트
	 */
	private static void iterativeDFS(Node root) {
		Deque<Node> stack = new ArrayDeque<Node>();
		stack.push(root);	//스택을 생성하고 생성한 스택에 root를 push함

		// if the stack is empty, we're done
		while (!stack.isEmpty()) {

			// otherwise pop the next Node off the stack
			Node node = stack.pop();
			if (node instanceof TextNode) {
				System.out.print(node);
			}

			// push the children onto the stack in reverse order
			List<Node> nodes = new ArrayList<Node>(node.childNodes());
			Collections.reverse(nodes);
			
			for (Node child: nodes) {
				stack.push(child);
			}
		}
	}

	private static void recursiveDFS(Node node) {
		if (node instanceof TextNode) {
			System.out.print(node);
		}
		for (Node child: node.childNodes()) {
			recursiveDFS(child);
		}
	}
}
