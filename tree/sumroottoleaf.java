public class sumroottoleaf {
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
   static int res = 0;
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int sum = 0;
        fun(root, sum);
       System.out.println(res);
    }

    static void fun(TreeNode root,int sum ){
        if(root ==null){
            return ;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            res+=sum;
        }
      
        fun(root.left,sum);
        fun(root.right,sum);

        
        
    }
}
