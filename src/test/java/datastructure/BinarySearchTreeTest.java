package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void solution() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(new int[] {3, 2, 1, 6, 7, 8, 4, 5});
        bst.printSorted();
        Node findNode = bst.findNode(4);
        bst.deleteNode(4);
        bst.printSorted();
    }
}