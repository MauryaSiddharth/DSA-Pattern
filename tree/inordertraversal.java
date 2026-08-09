public class inordertraversal {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Inorder Traversal
    static void fun(TreeNode root) {

        // Base case
        if (root == null) {
            return;
        }

        // Left
        fun(root.left);

        // Root
        System.out.print(root.val + " ");

        // Right
        fun(root.right);
    }

    public static void main(String[] args) {

        // Creating tree
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Calling function
        fun(root);
    }
}