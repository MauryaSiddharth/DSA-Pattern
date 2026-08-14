import java.util.HashMap;

public class constructtree{
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
       

    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder= {9,3,15,20,7};
        
    }
    static int idx = 0;
    static HashMap<Integer,Integer> map = new HashMap<>();

    static TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i <inorder.length;i++){
            map.put(inorder[i],i);
        }
        
         return fun(preorder, inorder, 0, inorder.length-1);
        
    }

    static TreeNode fun(int[] preorder,int[] inorder, int low , int high){
           if (low > high) {
              return null;
                 }
        TreeNode node= new TreeNode(preorder[idx]);
               idx++;

               int id = map.get(node.val);// to get index of this node in inorder

               node.left = fun(preorder, inorder, low, id-1); // left subtree
               node.right = fun(preorder, inorder, id+1, high);   // right subtree

               return node;

    }
}