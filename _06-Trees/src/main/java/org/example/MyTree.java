package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }

    public void insert(int value){
        Node newNode=new Node(value);
        if(root==null){
            root=newNode;
            return;
        }
        Node current=root;
        while (true){
            if(value<=current.value) {
                if(current.leftChild==null){
                   current.leftChild=newNode;
                   break;
                }
                current=current.leftChild;
            }
            else{
                if(current.rightChild==null){
                   current.rightChild=newNode;
                   break;
                }
                current=current.rightChild;
            }
        }
    }

    //PreOrder Travrsal of Tree Root-left-Right
    public void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.value+", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    //In - Order Traversal of Tree left-root-Right
    public void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }

    //Post - Order
    public void postOrderTraversal(Node root){
        if(root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value+", ");
    }

    public void levelOrderTraversal(){
        if(root==null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node toVisit= queue.poll();
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null){
                queue.add(toVisit.leftChild);
            }
            if (toVisit.rightChild!=null){
                queue.add(toVisit.rightChild);
            }
        }
    }

// Task - 1: if tree contains the function
    public boolean contains(int value){

        if(root==null) return false;
        Node current=root;
        while (current!=null){
            if(value< current.value)current=current.leftChild;
            else if (value> current.value)current=current.rightChild;
            else return true;
        }
        return false;
    }

// Task - 2: is it a leaf?
    public boolean isLeaf(Node node){
        return node.rightChild==null && node.leftChild==null;
    }

    // Task - 3: print the leaves
    public void printLeaves(Node node){
        if(root==null) return;
        if(isLeaf(root)) System.out.println(root.value+", ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }

// Task - 4: count the leaves
    public int countLeaves(Node node){
        if(root==null) return 0;

        if(isLeaf(root)) return 1;
        return countLeaves(root.rightChild) + countLeaves(root.leftChild);
    }
// Task - 5: count the leaves
    public int findSumLeaves(Node node){
        if(root==null) return 0;

        if(isLeaf(root)) return 1;
        return findSumLeaves(root.rightChild) + findSumLeaves(root.leftChild);
    }

// Task 6: height of a node in a BST
    public int height(Node root){
        if(root==null)return -1;
        if(isLeaf(root)) return 0;
        return 1+Math.max(height(root.rightChild),height(root.leftChild));

    }

    public int calculateSumNodeDepths(){
        return nodeDepthSum(root,0);
    }

    private int nodeDepthSum(Node root, int sum) {
        if(root==null) return 0;
        return sum+nodeDepthSum(root.leftChild, sum+1) + nodeDepthSum(root.rightChild,sum+1);
    }
}
