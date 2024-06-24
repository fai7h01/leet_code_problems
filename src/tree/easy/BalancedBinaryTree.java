package tree.easy;

import tree.TreeNode;

public class BalancedBinaryTree {

    static boolean isBalanced(TreeNode root){

        if (root == null) return true;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if (Math.abs(left - right) >= 2) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }


    static int getHeight(TreeNode root){

        if (root == null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        return Math.max(left,right) + 1;
    }

}
