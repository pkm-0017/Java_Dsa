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
    public boolean isEmpty(){
         return root==null ; 
    }
    public void insert(int val){
        root = insert(root , value);
    }
    private Node insert(int value , Node node){
        if(node==null){
            node = new Node(value);
            return node ;
        }
        if(value<node.value){
            node.left = insert(value , node.left);
        }
        if(value>node.value){
            node.right = insert(value , node.right);
        }
        // update the height
        node.height = Math.max(height(node.left) , height(node.right)) + 1 ;
        return node ;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true ; 
        }
        return Math.abs(height(node.left) - heigth(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


}