package datastructure;

import java.util.Arrays;

public class BinarySearchTree {
    Node root;

    public void addNode(int[] keys){
        Arrays.stream(keys).forEach(key -> addNode(key));
    }

    private void addNode(int key){
        Node node = new Node(key);
        if (root == null) {
            root = node;
        } else {
            Node parentNode, focusNode = root;
            while (focusNode != null){
                parentNode = focusNode;
                if (key < parentNode.key) {
                    focusNode = parentNode.leftChildNode;
                    if (focusNode == null){
                        parentNode.leftChildNode = node;
                        return;
                    }
                } else {
                    focusNode = parentNode.rightChildNode;
                    if (focusNode == null){
                        parentNode.rightChildNode = node;
                        return;
                    }
                }
            }
        }
    }

    public void deleteNode(int key){
        Node parentNode = root;
        Node deleteNode = root;
        while (deleteNode.key != key){
            parentNode = deleteNode;
            if (parentNode.key > key){
                deleteNode = parentNode.leftChildNode;
            } else {
                deleteNode = parentNode.rightChildNode;
            }
            if (deleteNode == null) return;
        }

        Node replaceNode = deleteNode.rightChildNode;
        while(replaceNode.leftChildNode != null){
            replaceNode = replaceNode.leftChildNode;
        }

        parentNode.rightChildNode = replaceNode;
        parentNode.leftChildNode = deleteNode.leftChildNode;

    }

    public Node findNode(int key){
        if (this.root == null) return null;
        Node findNode = this.root;
        while (findNode.key != key){
             if (findNode.key > key){
                findNode = findNode.leftChildNode;
            } else {
                findNode = findNode.rightChildNode;
            }
            if (findNode == null) return null;
        }
        return findNode;
    }

    public void printSorted (){
        inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node node){
        if (node != null){
            inOrderTraverse(node.leftChildNode);
            System.out.print(node.key + " ");
            inOrderTraverse(node.rightChildNode);
        }
    }

    private void preOrderTraverse(Node node){
        if (node != null){
            preOrderTraverse(node.leftChildNode);
            preOrderTraverse(node.rightChildNode);
            System.out.print(node.key + " ");
        }
    }
    private void postOrderTraverse(Node node){
        if (node != null){
            System.out.print(node.key + " ");
            preOrderTraverse(node.leftChildNode);
            preOrderTraverse(node.rightChildNode);
        }
    }
}

class Node {
    int key;
    Node leftChildNode;
    Node rightChildNode;

    Node (int key) {
        this.key = key;
    }
}