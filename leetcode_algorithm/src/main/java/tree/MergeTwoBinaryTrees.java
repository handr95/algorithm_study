package tree;

/**
 * 617. Merge Two Binary Trees (https://leetcode.com/problems/merge-two-binary-trees/)
 *
 * Given two binary trees and imagine that when you put one of them to cover the other,
 * some nodes of the two trees are overlapped while the others are not.
 *
 * You need to merge them into a new binary tree.
 * The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 *
 * Example 1:
 *
 * Input:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * Output:
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode treeNode = sumTowTrees(t1, t2);

        return treeNode;
    }

    public TreeNode sumTowTrees(TreeNode t1, TreeNode t2) {
        int t1Val = t1 != null ? t1.val : 0;
        int t2Val = t2 != null ? t2.val : 0;
        TreeNode tempTreeNode = new TreeNode(t1Val + t2Val);
        System.out.println("t1.val : " + t1Val + ", t2.val : " + t2Val);
        if (t1 != null && t2 != null) {
            sumTowTrees(t1.left, t2.left);
            sumTowTrees(t1, t2);
            sumTowTrees(t1.right, t2.right);
        }
        return tempTreeNode;
    }
}