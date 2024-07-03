package tree.easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    static List<Integer> inorderTraversal(TreeNode root){

        if (root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }

    static void inorderTraversal(TreeNode root, List<Integer> list){

        if (root == null) return;
        inorderTraversal(root.left,list);
        list.add(root.value);
        inorderTraversal(root.right,list);
    }

}
