package java.medium;

public class BinaryTreeLevelOrderTraversal {

    /**
     * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
     * 例如:
     * 给定二叉树: [3,9,20,null,null,15,7],
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回其层次遍历结果：
     * [
     *   [3],
     *   [9,20],
     *   [15,7]
     * ]
     */


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        // 递归
        addLevel(l, 0, root);
        return l;
    }

    /**
     * 分层，先左再右递归
     * @param list
     * @param level
     * @param node
     */
    public void addLevel(List<List<Integer>> list, int level, TreeNode node) {
        if (node == null) return;
        if(list.size() - 1 < level)
            list.add(new ArrayList<Integer>());
        list.get(level).add(node.val);

        addLevel(list, level+1, node.left);
        addLevel(list, level+1, node.right);
    }
}
