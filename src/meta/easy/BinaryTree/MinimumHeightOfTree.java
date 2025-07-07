package meta.easy.BinaryTree;

import meta.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumHeightOfTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        TreeNode node;
        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int index = 0; index < size; index++) {
                node = queue.poll();
                if (node.left == null && node.right == null) {
                    return level;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return level;
    }
  /*  Time and Space Complexity
    Metric	Value	Notes
    Time Complexity	O(n)	Every node is visited once in the worst case
    Space Complexity	O(w)	w = max width of the tree (queue size)*/
}
