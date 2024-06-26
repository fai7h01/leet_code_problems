package tree.easy;

import tree.TreeNode;

public class SameTree {

    static boolean isSameTree(TreeNode p, TreeNode q){

        if (p == null && q == null) return true;

        if (p == null && q != null || p != null && q == null) return false;

        if (p.value != q.value) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}
