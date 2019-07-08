package linkedlist;

public class RearIndex {
    public Node rearIndex(Node node, int index) {
        Node tempNode = node;
        int length = 0;
        while(tempNode !=null) {
            length ++;
            tempNode = tempNode.next;
        }

        while(length - index != 0) {
            node = node.next;
            length --;
        }

        return node;
    }

    public Node rearIndexSolution(Node node, int index) {
        Node p1 = node;
        Node p2 = node;

        for (int i = 0; i < index; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

    public int printKthLast(Node node, int k) {
        if (node == null) {
            return 0;
        }
        int index = printKthLast(node.next, k) + 1;
        System.out.println("index : " + index);
        if (index == k) {
            System.out.println(k + "th to last node is " + node.data);
        }
        return index;
    }
}
