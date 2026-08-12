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
        int target = 3;
        int sum=0;
     }
     static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>list = new ArrayList<>();
        
    }

     static List<List<Integer>> fun(TreeNode root, int targetSum,List<List<Integer>>list){
        if(root==null){
            return null;
        }
        list.add(Arrays.asList(root.val));

    }
    
}
