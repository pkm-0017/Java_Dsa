public class AVL {

    // Node class
    public class Node {
        int value;
        int height;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Height of node
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // Check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Insert
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Balance the node
        return rotate(node);
    }

    // Rotation logic
    private Node rotate(Node node) {

        // Left Heavy
        if (height(node.left) - height(node.right) > 1) {

            // Left Left Case
            if (height(node.left.left) >= height(node.left.right)) {
                return rightRotate(node);
            }

            // Left Right Case
            if (height(node.left.left) < height(node.left.right)) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right Heavy
        if (height(node.right) - height(node.left) > 1) {

            // Right Right Case
            if (height(node.right.right) >= height(node.right.left)) {
                return leftRotate(node);
            }

            // Right Left Case
            if (height(node.right.right) < height(node.right.left)) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    // Right Rotation
    private Node rightRotate(Node p) {

        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    // Left Rotation
    private Node leftRotate(Node c) {

        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    // Check if tree is balanced
    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {

        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    // Display tree
    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {

        if (node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    // Populate using array
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    // Preorder Traversal
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder Traversal
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Postorder Traversal
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
// hello
// my name is 