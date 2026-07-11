public class BST {

    // Node class
    public class Node {

        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
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

    // Insert a value
    public void insert(int value) {
        root = insert(value, root);
    }

    // Recursive insert method
    private Node insert(int value, Node node) {

        // Create a new node when empty position is found
        if (node == null) {
            return new Node(value);
        }

        // Smaller value goes to the left
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        // Greater value goes to the right
        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // Insert multiple values
    public void populate(int[] nums) {

        for (int num : nums) {
            insert(num);
        }
    }

    // Display tree
    public void display() {
        display(root, "Root Node: ");
    }

    // Recursive display method
    private void display(Node node, String details) {

        if (node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + ": ");

        display(node.right, "Right child of " + node.value + ": ");
    }

    // Check whether tree is balanced
    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {

        if (node == null) {
            return true;
        }

        int difference = Math.abs(height(node.left) - height(node.right));

        return difference <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    // Inorder traversal
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);

        System.out.print(node.value + " ");

        inorder(node.right);
    }

    // Search for a value
    public boolean search(int value) {
        return search(value, root);
    }

    private boolean search(int value, Node node) {

        if (node == null) {
            return false;
        }

        if (value == node.value) {
            return true;
        }

        if (value < node.value) {
            return search(value, node.left);
        }

        return search(value, node.right);
    }

    // Main method
    public static void main(String[] args) {

        BST tree = new BST();

        int[] numbers = {15, 10, 20, 5, 12, 17, 25};

        tree.populate(numbers);

        System.out.println("BST structure:");
        tree.display();

        System.out.println("\nInorder traversal:");
        tree.inorder();

        System.out.println("\nTree height: " + tree.height(tree.root));

        System.out.println("Is tree empty? " + tree.isEmpty());

        System.out.println("Is tree balanced? " + tree.balanced());

        System.out.println("Is 17 present? " + tree.search(17));

        System.out.println("Is 50 present? " + tree.search(50));
    }
}