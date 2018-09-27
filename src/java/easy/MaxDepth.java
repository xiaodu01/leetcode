package java.easy;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class MaxDepth {

    /**
     * 描述：求二叉树的最大深度
     * 如二叉树为
     *          1
     *         / \
     *        2   2
     *       / \  /\
     *      3  4 4  3
     *     /      \
     *    4        8
     * 的最大深度为 4
     */

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : (1 + Math.max(MaxDepth(root.left),MaxDepth(root.right)));
    }
}
