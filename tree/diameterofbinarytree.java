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
        root.left.left= new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(60);
        root.right.right.right = new TreeNode(69);
        fun(root);
        System.out.println(res);
        System.out.println(fun(root));
      
        
     }
     static int fun(TreeNode root){
        if(root ==null){
            return 0;
        }
        int left = fun(root.left);
        int right  = fun(root.right);
        int sum = left+right;
            res= Math.max(res, sum);

        return 1+Math.max(left,right); // ?
     }
}