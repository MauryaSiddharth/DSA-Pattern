import java.util.ArrayList;
import java.util.List;

public class validatebst {
      static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
       static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left= new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right= new TreeNode(6);
    root.right.right = new TreeNode(7);   
    // brute approach
    //       fun(root);
    // System.out.println(validatebst(root));
      
    System.out.println("optimizeed");
         validate(root);
         System.out.println(ans);

    }

    static void fun(TreeNode root){
        if(root == null){
            return ;
        }
        fun(root.left);
        list.add(root.val);
        fun(root.right);
    }
    //  brute approach -> inorder traversal then check it is sorted or not
    static boolean validatebst(TreeNode root){
 
        for(int i = 0; i < list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){  // see le
               return false;
            }
        }

      return true;

    }
    
    //  optimized way
     static TreeNode prev  = null;
    static    boolean ans = true;
    static void validate(TreeNode root){
        if(root == null){
            return ;
        }
        validate(root.left);
         if(prev==null){
            prev=root;

         }
         else{
            if(root.val<=prev.val){
                ans = false;
                prev=root;
            }
         }
         validate(root.right);
      
    }


}
