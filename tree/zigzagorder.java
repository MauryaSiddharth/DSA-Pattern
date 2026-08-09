import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzagorder {
    
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
        System.out.println(zigzag(root));
  }

  static List<List<Integer>>zigzag(TreeNode root){
           List<List<Integer>> ans = new ArrayList<>();
           
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            if (root == null){
                return ans ;
            }
         boolean lefttoRight = true;

         while (!q.isEmpty()) {
            int size = q.size();
                 List <Integer> level = new ArrayList<>();
                 
                 for(int i = 0; i <size;i++){
                    TreeNode node = q.poll();
                    if(lefttoRight==true){
                        level.add(node.val);
                       
                    }
                    else{
                        level.add(0,node.val); // ham jo value hai use 0 par rakh rhe hai
                        //  pehle 9 hoga 0 par , phir 20 ho jayga 0 par  , reverse hogaya

                    }
                    
                  if(node.left!=null){
                        q.offer(node.left);
                        
                    }

                    if(node.right!=null){
                          q.offer(node.right);
                          

                    }
                      
                    
                 }
                ans.add(level);
                lefttoRight=!lefttoRight;
            
         }
         return ans;
  }
    
}
