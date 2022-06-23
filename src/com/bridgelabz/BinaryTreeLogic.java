package com.bridgelabz;
class Node {
    int data;
    Node left, right;
}
public class BinaryTreeLogic {
    public Node insert(Node node, int data) {
        if (node == null) {
            return createNode(data);

        }
        if (data < node.data) {
            node.left = insert(node.left, data);

        } else if (data > node.data) {
            node.right = insert(node.right, data);

        }
        return node;

    }

    public Node createNode(int data) {
        Node root = new Node();
        root.data = data;
        root.left = null;
        root.right = null;
        return root;
    }

    public void inorderTraversal(Node node) {
        if (node == null)
            System.out.println("Tree is empty");
        else {
            if (node.left != null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if (node.right != null)
                inorderTraversal(node.right);

        }
    }
}




