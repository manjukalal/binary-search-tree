package com.bridgelabz;

public class BinarySearchTree {
    public static void main(String[] args) {
        System.out.println("WELCOME TO BINARY-SEARCH-PROGRAM");
        BinaryTreeLogic tree = new BinaryTreeLogic();
        Node node = new Node();
        tree.insert(node, 56);
        tree.insert(node, 30);
        tree.insert(node, 70);
        tree.insert(node, 22);
        tree.insert(node, 40);
        tree.insert(node, 11);
        tree.insert(node, 3);
        tree.insert(node, 16);
        tree.insert(node, 60);
        tree.insert(node, 95);
        tree.insert(node, 65);
        tree.insert(node, 63);
        tree.insert(node, 67);
        System.out.print("Level order traversal of binary tree is ");
        tree.inorderTraversal(node);

    }
}