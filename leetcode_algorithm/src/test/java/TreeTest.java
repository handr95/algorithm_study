import org.junit.Test;

import tree.MergeTwoBinaryTrees;
import tree.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeTest {

    @Test
    public void merge_two_binary_trees() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1_2 = new TreeNode(3);
        TreeNode t1_3 = new TreeNode(5);
        TreeNode t1_4 = new TreeNode(2);

        t1.left = t1_2;
        t1_2.left = t1_3;
        t1.right = t1_4;

        TreeNode t2 = new TreeNode(2);
        TreeNode t2_2 = new TreeNode(1);
        TreeNode t2_3 = new TreeNode(4);
        TreeNode t2_4 = new TreeNode(3);
        TreeNode t2_5 = new TreeNode(7);

        t2.left = t2_2;
        t2_2.right = t2_3;
        t2.right = t2_4;
        t2_4.right = t2_5;

        TreeNode tResult = new TreeNode(3);
        TreeNode tResult_2 = new TreeNode(4);
        TreeNode tResult_3 = new TreeNode(5);
        TreeNode tResult_4 = new TreeNode(4);
        TreeNode tResult_5 = new TreeNode(5);
        TreeNode tResult_6 = new TreeNode(7);

        tResult.left = tResult_2;
        tResult_2.left = tResult_3;
        tResult_2.right = tResult_4;
        tResult.right = tResult_5;
        tResult_5.right = tResult_6;

        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        TreeNode resultNode = mergeTwoBinaryTrees.mergeTrees(t1, t2);
        assertThat(resultNode.val).isEqualTo(3);
        assertThat(resultNode.left.val).isEqualTo(4);
        assertThat(resultNode.left.left.val).isEqualTo(5);
        assertThat(resultNode.left.right.val).isEqualTo(4);
        assertThat(resultNode.right.val).isEqualTo(5);
        assertThat(resultNode.right.right.val).isEqualTo(7);
    }
}
