class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
    //  this is search in simple binary tre 
public class SearchBinaryTree {

    static boolean search(Node root, int key) {

        // If tree is empty
        if (root == null)
            return false;

        // If key is found
        if (root.data == key)
            return true;

        // Search in left or right subtree
        return search(root.left, key) || search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        int key = 50;

        if (search(root, key))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}