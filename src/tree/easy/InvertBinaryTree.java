package tree.easy;

import tree.TreeNode;

public class InvertBinaryTree {


    static TreeNode invert(TreeNode root){

        if (root == null) return root;

        TreeNode leftTree = invert(root.right);
        TreeNode rightTree = invert(root.left);

        root.left = leftTree;
        root.right = rightTree;

        return root;

    }


}
