package meta.easy.BinaryTree;

import meta.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {
    class Pair {
        TreeNode node;
        int sum;

        Pair(TreeNode node, int sum) {
            this.node = node;
            this.sum = sum;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0) {
            return true;
        }
        Queue<Pair> queue = new LinkedList();
        queue.offer(new Pair(root, root.val));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int index = 0; index < size; index++) {
                Pair pair = queue.poll();
                int currSum = pair.sum;
                TreeNode node = pair.node;
                if (node.left == null && node.right == null && currSum == targetSum) {
                    return true;
                }
                if (node.left != null) {
                    queue.offer(new Pair(node.left, currSum + node.left.val));
                }
                if (node.right != null) {
                    queue.offer(new Pair(node.right, currSum + node.right.val));
                }
            }
        }
        return false;
    }
    /*
    Time and Space Complexity
    Metric	Value	Reason
    Time Complexity	O(n)	Visit each node once
    Space Complexity	O(n)	Queue size in worst case*/
}
