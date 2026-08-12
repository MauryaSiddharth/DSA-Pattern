import java.util.ArrayList;
import java.util.List;

public class twosum4{
   static List<Integer> list = new ArrayList<>();
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
   public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left= new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right= new TreeNode(6);
    root.right.right = new TreeNode(7);   
    int k = 19;

  boolean ans = check(root, k);
  System.out.println(ans);
   }
 

  static boolean check (TreeNode root,int k){
    fun(root);
    int i = 0;
    int j = list.size()-1;
    while(i<j){
         int sum  = list.get(i)+list.get(j);
         if(sum == k){
            return true;
         }

         if(sum>k){
            j--;
         }
         else{
            i++;
         }
    
       
    }
      return false;

  }

  static void fun(TreeNode root){
    if(root==null){
        return ;
    }
    fun(root.left);
    list.add(root.val);
    fun(root.right);
  }
   
//    There is a second approach also using stack and two pointer  refer that also
   
}