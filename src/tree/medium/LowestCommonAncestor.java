package tree.medium;

import tree.TreeNode;

public class LowestCommonAncestor {

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;

        return left == null ? right : left;

    }

    static TreeNode lca(TreeNode root, TreeNode p, TreeNode q){ //BST

        if (root == null) return null;

        if (p.value < root.value && q.value < root.value){
            return lca(root.left,p,q);
        }

        if (p.value > root.value && q.value > root.value){
            return lca(root.right,p,q);
        }

        return root;
    }

}
