package com.etherealhazel.algorithms;

public class StackArray {

    private String[] s;
    private int index = 0;

    public StackArray(int size) {
        s = new String[size];
    }

    public boolean isEmpty() {
        return false;
    }

    public void push(String data) {
        if (index == s.length) resize(2 * s.length);
        s[index++] = data;
    }

    public String pop() {
        String returnData = s[--index];
        s[index] = null;
        if (index > 0 && index == s.length / 4) {
            resize(s.length / 2);
        }
        return returnData;
    }

    private void resize(int newSize) {

        String[] copy = new String[newSize];
        for (int i = 0; i < index; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }
    
}
