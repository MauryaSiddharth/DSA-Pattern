import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class levelordertraversal {
    // Complexity: O(n) time and O(n) space.
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(9);
        root.right= new TreeNode(20);
        root.right.left= new TreeNode(15);
        root.right.right= new TreeNode(7);

        System.out.println(levelOrder(root));
        
        
    }
        static List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
           
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            if (root == null){
                return ans ;
            }

            while(!q.isEmpty()){
                int size = q.size();
                 List <Integer> level = new ArrayList<>();

                 for(int i = 0 ; i < size;i++){
                    TreeNode node = q.poll();
                    level.add(node.val);

                    if(node.left!=null){
                        q.add(node.left);
                    }

                    if(node.right!=null){  // if you have to print right to left move it above left
                        q.offer(node.right);
                    }

                 }
                 ans.add(level);
            }
            return ans;

        }

}
