package linkedlist;

import lombok.Getter;

public class Node {
    @Getter
    Node next = null;
    @Getter
    Integer data;
    public Node(Integer d) {
        data = d;
    }
    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;
        Node listToCompare = (Node) obj;
        Node thisList = this;
        while (listToCompare != null && thisList != null) {
            if (!listToCompare.getData().equals(thisList.getData()))
                return false;

            listToCompare = listToCompare.getNext();
            thisList = thisList.getNext();
        }
        if (listToCompare == null && thisList == null)
            return true;

        return false;

    }
}
