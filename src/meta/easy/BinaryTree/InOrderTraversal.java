package meta.easy.BinaryTree;

import meta.easy.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    private List<Integer> resultList;

    public List<Integer> inorderTraversalUsingRecursion(TreeNode root) {
        resultList = new ArrayList<>();
        inorderTraversalRec(root);
        return resultList;
    }

    private void inorderTraversalRec(TreeNode root) {
        if (root == null) return;
        inorderTraversalRec(root.left);
        resultList.add(root.val);
        inorderTraversalRec(root.right);
    }

    /*  Time & Space Complexity:
      Metric	Value	Notes
      Time Complexity	O(n)	Visit every node once
      Space Complexity	O(h)	Call stack depth (h = height of tree)
      Worst Case	O(n)	In skewed tree (like linked list)*/
    public List<Integer> inorderTraversalUsingStack(TreeNode root) {
        resultList = new ArrayList<>();
        if (root == null) return resultList;

        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {
            // Step 1: Go as left as possible
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            // Step 2: Process node
            root = stack.pop();
            resultList.add(root.val);

            // Step 3: Move to right subtree
            root = root.right;
        }
        return resultList;
    }
/*    Time and Space Complexity
    Metric	Value	Explanation
    Time Complexity	O(n)	Each node visited exactly once
    Space Complexity	O(h)	Stack stores path (max height h)
    Worst case space	O(n)	For skewed trees (linked-list shaped)*/
}
