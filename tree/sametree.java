public class sametree{
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

    public static void main (String[] args){
        TreeNode p = new TreeNode(1);
        p.left=new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left=new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(fun(p, q));
    }
    static boolean fun(TreeNode p , TreeNode q ){
        if(p== null && q == null){
            return true;
        }

        if(p==null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

     boolean r1 = fun(p.left,q.left);
     boolean r2 =  fun(p.right,q.right);

    //  if(r1==true && r2 == true){
    //     return true;
    //  }
    //  return false;
        return r1&r2;    
}
}