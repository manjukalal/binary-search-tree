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
                System.out.println(data);
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

    }



