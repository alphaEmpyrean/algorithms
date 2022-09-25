package com.etherealhazel.algorithms;

public class UFCompressedWeightedQuickUnion {
    
    private final int[] id;
    private final int[] count;

    public UFCompressedWeightedQuickUnion(int size) {
        id = new int[size];
        count = new int[size];

        for (int i = 0; i < size; i++) {
            id[i] = i;
            count[i] = 1;
        }
    }

    public int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        if (rootP == rootQ) { return; }
        if (count[rootP] < count[rootQ]) {
            id[rootP] = rootQ;
            count[rootQ] += count[rootP];
        } else {
            id[rootQ] = rootP;
            count[rootP] += rootQ;
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}

