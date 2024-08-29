
import java.util.Scanner;

class BinarySearchTree {
    
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

   
    Node root;

    
    void insert(int data) {
        root = insertRec(root, data);
    }

    
    Node insertRec(Node root, int data) {
        
        if (root == null) {
            root = new Node(data);
            return root;
        }
        
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        
        return root;
    }

    
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    
    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    
    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter numbers to insert into the BST. Type 'done' to finish:");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            bst.insert(number);
        }

        
        scanner.close();

        
        System.out.print("In-order traversal: ");
        bst.inorder();

        System.out.print("Pre-order traversal: ");
        bst.preorder();

        System.out.print("Post-order traversal: ");
        bst.postorder();
    }
}
