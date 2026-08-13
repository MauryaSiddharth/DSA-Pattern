import java.util.LinkedList;
import java.util.Queue;

public class completebinarytree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
          TreeNode root = new TreeNode(1);
             root.left = new TreeNode(2);
             root.right= new TreeNode(3);
             root.left.left= new TreeNode(4);
             root.left.right= new TreeNode(5);
             root.right.left = new TreeNode(6);
             System.out.println(isCompleteTree(root));
    }
    static boolean isCompleteTree(TreeNode root) {
         if(root==null){
            return true;
        }
        boolean nullFound = false;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t  = q.peek();
            q.poll();
            if(t==null){
                nullFound= true;
            }
            else{
                if(nullFound){
                    return false;
                }
                 q.add(t.left);
            q.add(t.right);
            }
           

        }

          return true;
    }
    
}
