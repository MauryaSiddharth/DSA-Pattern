public class lca {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static TreeNode temp = null;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        // These must be the actual nodes from the tree
        TreeNode p = root.left;        // 5
        TreeNode q = root.right;       // 1

        fun(root, p, q);

        System.out.println(temp.val);
    }

    static int fun(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return 0;
        }

        int left = fun(root.left, p, q);
        int right = fun(root.right, p, q);

        int self = 0;

        if (root == p || root == q) {
            self = 1;
        }

        int total = self + left + right;

        if (total == 2 && temp == null) { // 2 because we have given 2 node p and q  & null because i want first node 
            temp = root;
        }

        return total;
    }
}