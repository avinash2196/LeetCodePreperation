package meta.easy.BinaryTree;

import meta.easy.TreeNode;

public class ValidateIfTwoTreeAreSame {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
    /*Time and Space Complexity
    Metric	Value	Reason
    Time Complexity	O(n)	Visit every node once (n = total nodes)
    Space Complexity	O(h)	h = tree height, for recursive call stack
    Worst Case	O(n)	Skewed tree (e.g., all left nodes)*/
}
