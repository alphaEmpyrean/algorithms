package com.etherealhazel.algorithms;

public class UFQuickFind {
    
    private final int[] id;

    public UFQuickFind(int size) {

        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id[q]) { id[i] = id[p]; }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
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
