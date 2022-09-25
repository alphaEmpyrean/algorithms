package com.etherealhazel.algorithms;

import java.util.Iterator;

public class StackLinkedList<E> implements Iterable<E>{

    private Node headNode = null;
    private int nodeCount;

    public void push(E data) {
        
        Node oldHeadNode = headNode;
        headNode = new Node();
        headNode.data = data;
        headNode.next = oldHeadNode;
        nodeCount++;
    }

    public E pop() {
        E returnData = headNode.data;
        headNode = headNode.next;
        nodeCount--;
        return returnData;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public int getSize() {
        return nodeCount;
    }

    private class Node {
        E data;
        Node next;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            return null;
        }
        
    }
}
