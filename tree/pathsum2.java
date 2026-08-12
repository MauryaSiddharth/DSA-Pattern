import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pathsum2 {
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
        int targetSum = 3;
        int sum=0;
        System.out.println(pathSum(root,targetSum));
     }
     static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>list = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        fun(root,targetSum,list2,0,list);
        return list;
        
    }

     static void fun(TreeNode root, int targetSum,
                    List<Integer> list2, int sum,
                    List<List<Integer>> list) {

        if (root == null) {
            return;
        }

        sum += root.val;
        list2.add(root.val);

     
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                list.add(new ArrayList<>(list2));
            }
        }

       
        fun(root.left, targetSum, list2, sum, list);
        fun(root.right, targetSum, list2, sum, list);

    
        list2.remove(list2.size() - 1);
    }
    
}
