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
          fun(root);
    System.out.println(validatebst(root));

    }
    static void fun(TreeNode root){
        if(root == null){
            return ;
        }
        fun(root.left);
        list.add(root.val);
        fun(root.right);
    }
    //  brute approach
    static boolean validatebst(TreeNode root){
 
        for(int i = 0; i < list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){  // see le
               return false;
            }
        }

      return true;

    }
}
