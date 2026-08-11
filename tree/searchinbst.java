public class searchinbst {
//     check leetcode
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        // Creating a valid Binary Search Tree
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        // Search for value 7
        TreeNode result = searchBST(root, 7);

        if (result != null) {
            System.out.println("Value found: " + result.val);
        } else {
            System.out.println("Value not found");
        }
    }

    static TreeNode searchBST(TreeNode root, int val) {

        // Base case
        if (root == null || root.val == val) {
            return root;
        }

        // Search in left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        }

        // Search in right subtree
        return searchBST(root.right, val);
    }
}