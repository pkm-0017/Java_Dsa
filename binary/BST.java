public class BST {

    // Node class
    public class Node {

        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    // Root node
    private Node root;

    // Constructor
    public BST() {
        root = null;
    }

    // Return height of a node
    public int height(Node node) {

        if (node == null) {
            return -1;
        }

        return node.height;
    }

    // Check whether tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Public insert method
    public void insert(int value) {
        root = insert(value, root);
    }

    // Private recursive insert method
    private Node insert(int value, Node node) {

        // Create a new node
        if (node == null) {
            return new Node(value);
        }

        // Insert into left subtree
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        // Insert into right subtree
        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update the height of current node
        node.height =
                Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // Check whether the complete tree is balanced
    public boolean balanced() {
        return balanced(root);
    }

    // Check whether a subtree is balanced
    private boolean balanced(Node node) {

        if (node == null) {
            return true;
        }

        int difference =
                Math.abs(height(node.left) - height(node.right));

        return difference <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    // Public display method
    public void display() {
        display(root, "Root Node: ");
    }

    // Private recursive display method
    private void display(Node node, String details) {

        if (node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of " + node.value + ": ");
    }

    // Main method
    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(7);
        tree.insert(12);
        tree.insert(20);

        tree.display();

        System.out.println("Tree is empty: " + tree.isEmpty());
        System.out.println("Tree is balanced: " + tree.balanced());
    }
}