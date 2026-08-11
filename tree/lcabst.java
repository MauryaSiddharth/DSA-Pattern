public class lcabst{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static TreeNode temp = null;

// p<q always
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left= new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        root.left.right= new TreeNode(7);
        root.left.right.left=new TreeNode(6);
        root.left.right.right= new TreeNode(8);

        root.right= new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(17);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(14);
        root.right.right.left = new TreeNode(16);
        root.right.right.right = new TreeNode(18);

        TreeNode p  =    root.left.left.right ;
        TreeNode q = root.left.right.left;
        
    //           Edge case 
        // if(p.val<q.val){
        //     fun(root,p,q);
        // }
        // else{
        //     fun(root,q,p);
        // }


        fun(root, p, q);   //  but here and leetcode  generaly p < q 
        System.out.println(temp.val);
        
    }
    static void fun (TreeNode root, TreeNode p ,TreeNode q){
        if(root == null){
            return;
        }
        if(root == p || root ==q ){
            temp = root;
        }
        if(root.val<p.val && root.val<q.val){
            fun(root.right,p,q);
        }

        else if(root.val>q.val){
            fun(root.left,p,q);
        }

     else{    //(root.val>p.val && root.val<q.val) this case
       temp =root;
     }

    }
}