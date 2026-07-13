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

    // Root node of the tree
    private Node root;

    // Constructor
    public BST() {
        root = null;
    }

    // Return the height of a node
    public int height(Node node) {

        if (node == null) {
            return -1;
        }

        return node.height;
    }

    // Return the height of the complete tree
    public int height() {
        return height(root);
    }

    // Check whether the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Public insert method
    public void insert(int value) {
        root = insert(value, root);
    }

    // Private recursive insert method
    private Node insert(int value, Node node) {

        // Empty position found
        if (node == null) {
            return new Node(value);
        }

        // Insert into the left subtree
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        // Insert into the right subtree
        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update the height of the current node
        node.height =
                Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // Insert all values from an array
    public void populate(int[] numbers) {

        for (int value : numbers) {
            insert(value);
        }
    }

    // Check whether the complete tree is balanced
    public boolean balanced() {
        return balanced(root);
    }

    // Check whether a subtree is balanced
    private boolean balanced(Node node) {

        // An empty tree is balanced
        if (node == null) {
            return true;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int difference =
                Math.abs(leftHeight - rightHeight);

        return difference <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    // Search for a value
    public boolean search(int value) {
        return search(value, root);
    }

    // Private recursive search method
    private boolean search(int value, Node node) {

        // Value was not found
        if (node == null) {
            return false;
        }

        // Value was found
        if (value == node.value) {
            return true;
        }

        // Search in the left subtree
        if (value < node.value) {
            return search(value, node.left);
        }

        // Search in the right subtree
        return search(value, node.right);
    }

    // Display the tree
    public void display() {
        display(root, "Root Node: ");
    }

    // Private recursive display method
    private void display(Node node, String details) {

        if (node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(
                node.left,
                "Left child of " + node.value + ": "
        );

        display(
                node.right,
                "Right child of " + node.value + ": "
        );
    }

    // Inorder traversal
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    // Left → Root → Right
    private void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);

        System.out.print(node.value + " ");

        inorder(node.right);
    }

    // Preorder traversal
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    // Root → Left → Right
    private void preorder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");

        preorder(node.left);

        preorder(node.right);
    }

    // Postorder traversal
    public void postorder() {
        postorder(root);
        System.out.println();
    }

    // Left → Right → Root
    private void postorder(Node node) {

        if (node == null) {
            return;
        }

        postorder(node.left);

        postorder(node.right);

        System.out.print(node.value + " ");
    }

    // Main method
    public static void main(String[] args) {

        BST tree = new BST();

        int[] numbers = {
                10, 5, 15, 2, 7, 12, 20
        };

        tree.populate(numbers);

        System.out.println("Tree structure:");
        tree.display();

        System.out.println();

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("Preorder traversal:");
        tree.preorder();

        System.out.println("Postorder traversal:");
        tree.postorder();

        System.out.println();

        System.out.println(
                "Tree height: " + tree.height()
        );

        System.out.println(
                "Tree is empty: " + tree.isEmpty()
        );

        System.out.println(
                "Tree is balanced: " + tree.balanced()
        );

        System.out.println(
                "Search 7: " + tree.search(7)
        );

        System.out.println(
                "Search 100: " + tree.search(100)
        );
    }
}