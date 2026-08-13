import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class recoverbst {
      static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
       static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
         TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left= new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right= new TreeNode(7);
    root.right.right = new TreeNode(6);
    fun(root);
    if(galat==1){
        swap(g1first, g1second);

    }
    else{
        swap(g1first, g2second);
    }
    //  in main i swaaped 6,7 to 7,6

    System.out.println(  root.right.val);
    System.out.println(  root.right.right.val);
    }
    static TreeNode prev = null;
    static TreeNode g1first = null;
     static TreeNode g1second = null;
    static TreeNode g2first = null;
     static TreeNode g2second = null;
     static int galat =0;
     

    static void fun(TreeNode root){
        if(root == null){
            return; 
        }
        fun(root.left);
        if(prev==null){
           prev=root;
        }
        else{
             if(root.val<prev.val){
                if(galat==0){
                    g1first = prev;
                    g1second= root;
                    galat++;
                }
               
                else{
                    g2first=prev;
                    g2second=root;
                    galat++;
                }

             }
             prev=root;
        }
        fun(root.right);


    }
    static void swap(TreeNode a ,TreeNode b){
        int temp = a.val;
        a.val=b.val;
        b.val=temp;
    }
}
