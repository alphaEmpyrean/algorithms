package com.etherealhazel.algorithms;
public class UFQuickUnion {

    private final int[] id;

    public UFQuickUnion(int size) {

        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }

    }

    public int root(int p) {
        while (p != id[p]) { p = id[p]; }
        return p;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        id[rootP] = rootQ;
    }

    public static void main(String[] args) {
        UFQuickFind uf = new UFQuickFind(10);

        uf.union(0, 1);
        uf.union(2, 3);
        uf.union(5, 9);
        uf.union(9, 6);
        uf.union(3, 7);
        uf.union(0, 8);

        System.out.println(uf.connected(0, 9));
        System.out.println(uf.connected(8, 1));
        System.out.println(uf.connected(3, 5));
        uf.union(7, 9);
        System.out.println(uf.connected(3, 5));
    }
    
}
