package BTree;

class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        right=left=null;
    }
}

public class BinaryTree {
    Node root;
    int value;
    BinaryTree(){
        root=null;
    }
    void inOrder(Node node){
        if(node!=null){
            // System.out.println(node.data+" ");
            // preOrder(node.left);
            // preOrder(node.right);
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
    Node insert(Node root, int value) {
        if (root == null) {
            root=new  Node(value);
            return root;
        }


        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }
 
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();

        //pre order

        // tree.root=new Node(1);
        // tree.root.left=new Node(2);
        // tree.root.left.left=new Node(4);
        // tree.root.left.right=new Node(5);
        // tree.root.left.left.left=new Node(8);
        // tree.root.right=new Node(3);
        // tree.root.right.left=new Node(6);
        // tree.root.right.right=new Node(7);
        // tree.root.right.left.left=new Node(9);
        // tree.root.right.left.right=new Node(10);


//inorder
tree.root = tree.insert(tree.root, 50);
tree.insert(tree.root, 30);
tree.insert(tree.root, 20);
tree.insert(tree.root, 40);
tree.insert(tree.root, 70);
tree.insert(tree.root, 60);
tree.insert(tree.root, 80);
tree.inOrder(tree.root);
        // tree.preOrder(tree.root);
    }
}