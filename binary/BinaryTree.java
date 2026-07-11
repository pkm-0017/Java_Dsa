import java.util.Scanner;

public class BinaryTree {

    private Node root;

    // Node class
    private class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // Create the tree
    public void populate(Scanner sc) {
        System.out.print("Enter the root node: ");
        int value = sc.nextInt();

        root = new Node(value);

        populate(sc, root); // This calls the recursive method and says:
    }

    // Recursive method to create children
    private void populate(Scanner sc, Node node) {

        System.out.print("Does " + node.val + " have a left child? (true/false): ");
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.print("Enter the value of left child: ");
            int value = sc.nextInt();

            node.left = new Node(value);

            populate(sc, node.left);
        }

        System.out.print("Does " + node.val + " have a right child? (true/false): ");
        boolean right = sc.nextBoolean();

        if (right) {
            System.out.print("Enter the value of right child: ");
            int value = sc.nextInt();

            node.right = new Node(value);

            populate(sc, node.right);
        }
    }

    // Display the tree
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

        Scanner sc = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        tree.populate(sc);

        System.out.println("\nBinary Tree:");

        tree.display();

        sc.close();
    }
}