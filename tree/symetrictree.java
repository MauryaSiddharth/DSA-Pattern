public class symetrictree {
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
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left= new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
        
    }
     static boolean isSymmetric(TreeNode root) {
        TreeNode p = root.left;
        TreeNode q = root.right;

        return fun(p, q);
        
        
        
    }
    static boolean fun (TreeNode p ,TreeNode q){
        if(p==null && q== null){
            return true;
        }
         if(p==null || q == null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }

        boolean r1 = fun(p.left,q.right);
        boolean r2 = fun(p.right, q.left);

     if(r1==true && r2 == true){
        return false;
     }
     return true;

    }
}
