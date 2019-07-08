import org.junit.Test;

import linkedlist.DuplicateDelete;
import linkedlist.MiddleNodeDelete;
import linkedlist.Node;
import linkedlist.RearIndex;
import linkedlist.RearIndexSolution;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeTest {

    @Test
    public void duplicate_delete_test() {
        DuplicateDelete duplicateDelete = new DuplicateDelete();
        Node node1 = new Node(5);

        node1.appendToTail(3);
        node1.appendToTail(4);
        node1.appendToTail(5);
        node1.appendToTail(2);
        node1.appendToTail(1);
        node1.appendToTail(4);

        Node node2 = new Node(5);

        node2.appendToTail(3);
        node2.appendToTail(4);
        node2.appendToTail(2);
        node2.appendToTail(1);

        assertThat(duplicateDelete.duplicateDelete(node1)).isEqualTo(node2);
    }

    @Test
    public void reat_index_test() {
        RearIndex rearIndex = new RearIndex();
        Node node1 = new Node(5);

        node1.appendToTail(3);
        node1.appendToTail(4);
        node1.appendToTail(5);
        node1.appendToTail(2);
        node1.appendToTail(1);
        node1.appendToTail(4);

        assertThat(rearIndex.rearIndex(node1, 3)).isEqualTo(node1.getNext().getNext().getNext().getNext());
        assertThat(rearIndex.rearIndexSolution(node1, 3)).isEqualTo(node1.getNext().getNext().getNext().getNext());
    }

    @Test
    public void reat_index_solution_test() {
        RearIndexSolution rearIndexSolution = new RearIndexSolution();
        Node node1 = new Node(5);

        node1.appendToTail(3);
        node1.appendToTail(4);
        node1.appendToTail(5);
        node1.appendToTail(2);
        node1.appendToTail(1);
        node1.appendToTail(4);

        assertThat(rearIndexSolution.kthToLast(node1, 3)).isEqualTo(node1.getNext().getNext().getNext().getNext());
    }

    @Test
    public void middle_node_delete_test() {
        MiddleNodeDelete middleNodeDelete = new MiddleNodeDelete();
        Node node1 = new Node(5);

        node1.appendToTail(4);
        node1.appendToTail(3);
        node1.appendToTail(2);
        node1.appendToTail(1);

        Node node2 = new Node(5);

        node2.appendToTail(4);
        node2.appendToTail(2);
        node2.appendToTail(1);

        assertThat(middleNodeDelete.middleNodeDelete(node1)).isEqualTo(node2);
    }
}
