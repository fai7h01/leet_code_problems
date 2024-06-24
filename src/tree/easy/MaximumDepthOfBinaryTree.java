package tree.easy;

import tree.TreeNode;

public class MaximumDepthOfBinaryTree {

    static int maxDepth(TreeNode root){

        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth,rightDepth) + 1;

    }

}
