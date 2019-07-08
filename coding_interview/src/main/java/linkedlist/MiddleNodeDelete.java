package linkedlist;

public class MiddleNodeDelete {
    public Node middleNodeDelete(Node node) {
        Node tempNode = node;
        int length = 0;
        while(tempNode !=null) {
            length ++;
            tempNode = tempNode.next;
        }

        if (length < 3) {
            return node;
        }

        int deleteIdx = length / 2 + (length % 2);
        Node tempNode2 = node;
        Node preNode = null;

        int index = 1;
        while(index != deleteIdx) {
            preNode = tempNode2;
            tempNode2 = tempNode2.next;
            index ++;
        }

        preNode.next = tempNode2.next;

        return node;
    }
}
