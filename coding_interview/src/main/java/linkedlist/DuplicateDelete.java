package linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 연결 리스트
 *
 * 2.1 중복 없애기
 * 정렬되어 있지 않은 연결리스트가 주어졌을 때 이 리스트에서 중복되는 원소를 제거하는 코드를 작성하라.
 */
public class DuplicateDelete {
    public Node duplicateDelete(Node node) {
        Node preNode = null;
        Node tempNode = node;
        List<Integer> nodeValList = new ArrayList<>();
        while(tempNode != null) {
            if (!nodeValList.contains(tempNode.data)) {
                nodeValList.add(tempNode.data);
            } else {
                preNode.next = tempNode.next;
            }

            preNode = tempNode;
            tempNode = tempNode.next;
        }
        return node;
    }

    public Node duplicateDeleteSolution(Node node) {
        Node preNode = node;
        List<Integer> nodeValList = new ArrayList<>();
        while(node != null) {
            if (!nodeValList.contains(node.data)) {
                nodeValList.add(node.data);
                preNode = node;
            } else {
                preNode.next = node.next;
            }

            node = node.next;
        }
        return node;
    }
}
