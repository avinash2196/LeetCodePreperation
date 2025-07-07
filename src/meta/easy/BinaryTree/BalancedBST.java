package meta.easy.BinaryTree;

import meta.TreeNode;

public class BalancedBST {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        //for a tree to be balanced both of its left/right should be balanced and height diff should be less than 2
        return ((isBalanced(root.left) && isBalanced(root.right))
                && Math.abs(height(root.left)-height(root.right))<2);
    }
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        return Math.max(leftHeight,rightHeight)+1;
    }/*
    Time & Space Complexity Comparison
    Version	Time	Space
    Your version	O(n²)	O(h) (stack)*/

    public boolean isBalancedOptimal(TreeNode root) {
        return checkHeight(root)!=-1;
    }

    private int checkHeight(TreeNode node) {
        if(node==null)
            return 0;
        int leftHeight=checkHeight(node.left);
        if(leftHeight==-1) return -1;
        int rightHeight=checkHeight(node.right);
        if(rightHeight==-1) return -1;
        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
}
