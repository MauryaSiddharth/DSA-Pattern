public class diameterofbinarytree{
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
        res=0;
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        fun(root);
        System.out.println(res);
      
        
     }
     static int fun(TreeNode root){
        if(root ==null){
            return 0;
        }
        int left = fun(root.left);
        int right  = fun(root.right);
        int sum = left+right;
            res= Math.max(res, sum);

        return 1+Math.max(left,right); // 
     }
}