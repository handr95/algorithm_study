package linkedlist;

public class RearIndexSolution {
    class Index {
        public int value = 0;
    }
    public Node kthToLast (Node head, int k) {
        Index idx = new Index();
        return kthToLast(head, k, idx);
    }

    Node kthToLast (Node head, int k, Index idx) {
        if (head == null) return null;
        Node node = kthToLast(head.next, k, idx);
        idx.value = idx.value + 1;
        if (idx.value == k) {
            return head;
        }
        return node;
    }
}
