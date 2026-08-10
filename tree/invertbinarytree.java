

public class invertbinarytree {
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
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left=new TreeNode(7);
        root.left.right = new TreeNode(3);
        root.right.left= new TreeNode(6);
        root.right.right = new TreeNode(9);
        invertTree(root);
        System.out.println(root);
        
    }
     static TreeNode invertTree(TreeNode root) {
         if(root == null){
        return null;
      }
       TreeNode temp = root.left;
       root.left = root.right ;
       root.right = temp;
       invertTree(root.left);
       invertTree(root.right);

       return root;

    }


}
