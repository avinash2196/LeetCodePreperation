package meta.easy.LinkedList.OnePointer;

import meta.TreeNode;

public class ClosestBinaryTreeValue {
    public int closestValue(TreeNode root, double target) {
        //find closestValue by checking if diff between last closestValue and target is greater than curr val and target
        //or if diff is same ..also check the lowest val
        int closest = root.val;
        while (root != null) {
            if ((Math.abs(root.val - target) < Math.abs(closest - target)) || (Math.abs(root.val - target) == Math.abs(closest - target) && root.val < closest)) {
                closest = root.val;
            }
            root = root.val > target ? root.left : root.right;
        }
        return closest;
    }

/*    COMPLEXITY
    Metric	Value
    Time	O(h) (h = height of BST)
    Space	O(1) (iterative)*/
}
