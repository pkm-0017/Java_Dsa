import java.util.Scanner ;
public class bina{
    private Node root ;
    private class Node{
        int val ; 
        Node left ; 
        Node right ;
        Node(int val){
            this.val = val ;
        }
    }
    public void pop(Scanner s){
        System.out.print("Enter the root node");
        int val = s.nextInt();
        root = new Node(val);

    }
    private void pop(Scanner sc , Node node){
        System.out.print("Does" + node.val + "have a left child?(true/false):" );
        boolean left =  sc.nextBoolean();
        if ( left){
            System.out.print("Enter the value of left child");
                int val = sc.nextInt();
                node.left = new Node(val);
                
            );
        }

    }

    public static void main(String args[]){
        
    }
}