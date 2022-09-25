package com.etherealhazel.algorithms;

public class BitonicSearch {

    public static int ascendingRecursiveBinarySearch(int[] searchArray, int target, int left, int right) {

        if (left == right) {
            return (searchArray[right] == target) ? right : -1;
        }

        int mid = left + (right - left)/2;
        if (searchArray[mid] == target) {
            return mid;
        }

        if (left + 1 == right) {
            return (searchArray[right] == target) ? right : -1;
        }

        if (target > searchArray[mid]) {
            return ascendingRecursiveBinarySearch(searchArray, target, mid + 1, right);
        } else {
            return ascendingRecursiveBinarySearch(searchArray, target, left, mid);
        }
    }

    public static int descendingRecursiveBinarySearch(int[] searchArray, int target, int left, int right) {

        if (left == right) {
            return (searchArray[right] == target) ? right : -1;
        }

        int mid = left + (right - left)/2;
        if (searchArray[mid] == target) {
            return mid;
        }

        if (left + 1 == right) {
            return (searchArray[right] == target) ? right : -1;
        }

        if (target < searchArray[mid]) {
            return descendingRecursiveBinarySearch(searchArray, target, mid + 1, right);
        } else {
            return descendingRecursiveBinarySearch(searchArray, target, left, mid);
        }

    }

    public static int search(int[] searchArray, int target, int left, int right) {

        if (left == right) {
            return (searchArray[right] == target) ? right : -1;
        }

        int mid = left + (right - left)/2;
        if (searchArray[mid] == target) {
            return mid;
        }

        if (left + 1 == right) {
            return (searchArray[right] == target) ? right : -1;
        }

        if (searchArray[mid] > searchArray[mid - 1]) {

            if (target > searchArray[mid]) {
                return search(searchArray, target, mid + 1, right);
            } else {
                int targetIndex = ascendingRecursiveBinarySearch(searchArray, target, left, mid);
                if (targetIndex != -1) { return targetIndex; }
                return descendingRecursiveBinarySearch(searchArray, target, mid + 1, right);
            }

        } else {

            if (target > searchArray[mid]) {
                return search(searchArray, target, left, mid);
            } else {
                int targetIndex = ascendingRecursiveBinarySearch(searchArray, target, left, mid);
                if (targetIndex != -1) { return targetIndex; }
                return descendingRecursiveBinarySearch(searchArray, target, mid + 1, right);
            }
        }
    }

    public static void main(String[] args) {

        int[] searchArray = new int[]{-15, -10, -3, 3, 7, 9, 13, 18, 23, 29, 30, 31, 45, 47, 56, 78, 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 69, 68, 67, 66, 65, 64, 63};

/*         for (int i = 0; i < searchArray.length; i++) {
            System.out.println(search(searchArray, searchArray[i], 0, searchArray.length - 1));
        } */

        System.out.println(search(searchArray, 98, 0, searchArray.length - 1));
    }
}