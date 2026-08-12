public class pathsum1{
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int target = 3;
        int sum=0;
        System.out.println(fun(root, target, sum));
    }

    static boolean fun(TreeNode root, int target,int sum){
        if(root == null){
            return false ;
        }
        sum = sum+root.val;
        if(root.left == null && root.right ==null){
           return sum==target;
        }

          return fun(root.left, target, sum) ||fun(root.right, target, sum);

    }
}

                                // alternate 

 
// class Solution {
//     static boolean res = false;
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//              res=false;
//         fun(root,targetSum,0);
//         return res;
//     }
//     static void fun(TreeNode root, int targetSum , int sum){
//         if (root==null){
//             return;
//         }
//         sum+=root.val;
//         if(root.left==null && root.right == null){
//             if(sum==targetSum){
//                 res =true;
//                 return;
//             }        
//         }

//          fun(root.left,targetSum,sum);
//             fun(root.right,targetSum,sum);
//             return;
//     }
// }