package tree.medium;

import com.sun.source.tree.Tree;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    static List<List<Integer>> levelOrderTraversal(TreeNode root){

        if (root == null) return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
           int levelSize = queue.size();
           List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode toVisit = queue.poll();
                level.add(toVisit.value);
                if (toVisit.left != null){
                    queue.add(toVisit.left);
                }
                if (toVisit.right != null){
                    queue.add(toVisit.right);
                }
            }
            ans.add(level);
        }

        return ans;
    }

}
