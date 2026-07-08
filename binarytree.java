import java.util.Scanner;

class BinaryTree {

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner s) {
        System.out.print("Enter the root node: ");
        int val = s.nextInt();
        root = new Node(val);

        populate(s, root);
    }

    private void populate(Scanner s, Node node) {

        // Left child
        System.out.print("Does " + node.val + " have a left child? (true/false): ");
        boolean left = s.nextBoolean();

        if (left) {
            System.out.print("Enter the value of left child: ");
            int value = s.nextInt();

            node.left = new Node(value);
            populate(s, node.left);
        }

        // Right child
        System.out.print("Does " + node.val + " have a right child? (true/false): ");
        boolean right = s.nextBoolean();

        if (right) {
            System.out.print("Enter the value of right child: ");
            int value = s.nextInt();

            node.right = new Node(value);
            populate(s, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.val);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        tree.populate(s);

        System.out.println("\nBinary Tree:");

        tree.display();

        s.close();
    }
}