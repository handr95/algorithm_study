import linked_list.ListNode;
import org.junit.Test;

public class ListNodeTest {

    @Test
    public void list_node_test01() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;  //리스트의 마지막 노드에서 관례상 next 변수는 null이다.

        ListNode node0 = new ListNode(0, node1);
    }
}

