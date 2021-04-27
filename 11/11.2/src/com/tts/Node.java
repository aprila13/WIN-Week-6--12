package com.tts;

public class Node {
    Node left; //Refers to the circle
    Node right; //Refers to the circle
    int data; //Refers to the number within the circle

    //Constructor to bind the data variable to the data passed in the method
    public Node(int data) {
        this.data = data;
    }

    //This method will take a node value, look to the left and right to decide where to insert
    public void insert(int value) { //Insert takes in value as a param (int)
        if (value <= data) { //A. If the value that is passed in the method is less than or equal to the current data (num in circle) --> then B.
            if (left == null) { //B. If the left circle doesn't have a value yet --> then C.
                left = new Node(value); //C. The left space will be created with the value passed into the method
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contain(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contain(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contain(value);
            }
        }
    }


    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
}

//Video:  https://www.youtube.com/watch?v=oSWTXtMglKE