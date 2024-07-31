import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    // Function to insert a new node with given data
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Function to find the lowest common ancestor
    public static Node lca(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }
        // If both v1 and v2 are smaller than root, LCA lies in left subtree
        if (v1 < root.data && v2 < root.data) {
            return lca(root.left, v1, v2);
        }
        // If both v1 and v2 are greater than root, LCA lies in right subtree
        if (v1 > root.data && v2 > root.data) {
            return lca(root.right, v1, v2);
        }
        // If one value is on one side and the other is on the other side, root is the LCA
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of nodes
        Node root = null;
        
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        Node ancestor = lca(root, v1, v2);
        System.out.println(ancestor.data);
        
        scanner.close();
    }
}
