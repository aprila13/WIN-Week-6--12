package com.tts;

public class Main {

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "Boss");

        theTree.addNode(25, "Vice President");

        theTree.addNode(15, "Office Manager");

        theTree.addNode(30, "Secretary");

        theTree.addNode(75, "Sales Manager");

        theTree.addNode(85, "Salesman 1");

        // Different ways to traverse binary trees

        // theTree.inOrderTraverseTree(theTree.root);

        // theTree.preorderTraverseTree(theTree.root);

        // theTree.postOrderTraverseTree(theTree.root);

        // Find the node with key 75

        System.out.println("\nNode with the key 75");

        System.out.println(theTree.findNode(75));

    }
}



//Trees:
//Depth - Number of spaces from the root to the node
//Height - Number of spaces from the node to the leaf (childless node)
//Height of Tree - Height of the root.  Root - farthest leaf
//A root has depth 0 and a leaf has height 0