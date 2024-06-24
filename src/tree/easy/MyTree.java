package tree.easy;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TreeNode root;


    void insert(int value){

        TreeNode node = new TreeNode(value);

        if (root == null){
            root = node;
            return;
        }

        TreeNode current = root;

        while(true){

            if (value <= current.value){
                if (current.left == null){
                    current.left = node;
                    break;
                }
                current = current.left;
            }else{
                if (current.right == null){
                    current.right = node;
                    break;
                }
                current = current.right;
            }

        }

    }

    //Breadth first search
    void levelOrderTraversal(){

        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode toVisit = queue.poll();
            System.out.println(toVisit + ", ");
            if (toVisit.left != null){
                queue.add(toVisit.left);
            }
            if (toVisit.right != null){
                queue.add(toVisit.right);
            }
        }

    }


}
