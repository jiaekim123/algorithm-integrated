/*
    https://programmers.co.kr/learn/courses/30/lessons/42892
    [프로그래머스][2019 KAKAO BLIND RECRUITMENT] 길찾기 게임
 */
package programmers.courses30.lesson42892;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

class Solution {
    Node root;

    public int[][] solution(int[][] nodeinfo) {
        List<Node> nodeList = new LinkedList<>();
        for (int i = 0; i < nodeinfo.length; i++) {
            nodeList.add(new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1]));
        }
        Collections.sort(nodeList);

        for (int i = 0; i < nodeList.size(); i++) {
            addNode(nodeList.get(i));
        }

        return getAnswer();
    }

    private void addNode(Node node) {
        if (root == null) {
            root = node;
        } else {
            Node parentNode, focusNode = root;
            while (focusNode != null) {
                parentNode = focusNode;
                if (node.x < parentNode.x) {
                    focusNode = parentNode.leftChildNode;
                    if (focusNode == null) {
                        parentNode.leftChildNode = node;
                        return;
                    }
                } else {
                    focusNode = parentNode.rightChildNode;
                    if (focusNode == null) {
                        parentNode.rightChildNode = node;
                        return;
                    }
                }
            }
        }
    }

    private void inOrderTraverse(Node node) {
        if (node != null) {
            inOrderTraverse(node.leftChildNode);
            System.out.print(node.key + " ");
            inOrderTraverse(node.rightChildNode);
        }
    }

    private int[][] getAnswer() {
        List<Integer> preOrderAnswer = new LinkedList<>();
        List<Integer> postOrderAnswer = new LinkedList<>();

        preOrderTraverse(root, preOrderAnswer);
        postOrderTraverse(root, postOrderAnswer);

        int[][] answer = new int[2][preOrderAnswer.size()];
        answer[0] = preOrderAnswer.stream().mapToInt(i -> i).toArray();
        answer[1] = postOrderAnswer.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    private void postOrderTraverse(Node node, List<Integer> answer) {
        if (node != null) {
            postOrderTraverse(node.leftChildNode, answer);
            postOrderTraverse(node.rightChildNode, answer);
            answer.add(node.key);
        }
    }

    private void preOrderTraverse(Node node, List<Integer> answer) {
        if (node != null) {
            answer.add(node.key);
            preOrderTraverse(node.leftChildNode, answer);
            preOrderTraverse(node.rightChildNode, answer);
        }
    }
}

class Node implements Comparable<Node> {
    int key;
    int x;
    int y;
    Node leftChildNode;
    Node rightChildNode;

    Node(int key, int x, int y) {
        this.key = key;
        this.x = x;
        this.y = y;
    }

    Node(int key) {
        this.key = key;
    }

    @Override
    public int compareTo(Node node) {
        if (node.y != this.y) {
            return node.y - this.y;
        } else {
            return this.x - node.x;
        }
    }
}