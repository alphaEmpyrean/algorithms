package com.etherealhazel.algorithms;

public class QueueLinkedList {

    private Node headNode = null, tailNode = null;
    private int nodeCount = 0;

    public boolean isEmpty() {
        return (headNode == null);
    }

    public void enqueue(String data) {

        Node oldTailNode = tailNode;
        tailNode = new Node();
        tailNode.data = data;
        tailNode.next = null;
        nodeCount++;

        if (isEmpty()) {
            tailNode = headNode;
        } else {
            oldTailNode.next = tailNode;
        }
    }

    public String dequeue() {

        String returnString = headNode.data;
        headNode = headNode.next;
        nodeCount--;

        if (isEmpty()) {
            tailNode = null;
        }

        return returnString;
    }

    public int getSize() {
        return nodeCount;
    }

    class Node {
        String data;
        Node next;
    }    
}
