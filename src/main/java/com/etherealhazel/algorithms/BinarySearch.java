package com.etherealhazel.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class BinarySearch {

    public static int search(int[] searchArray, int target) {

        int hi = searchArray.length -1, lo = 0, mid;

        while (lo <= hi) {
            mid = lo + (hi - lo)/2;
            if (searchArray[mid] == target) {
                return mid;
            } else if (searchArray[mid] < target) {
                lo = mid + 1;
            } else if (searchArray[mid] > target) {
                hi = mid - 1;
            }
        }

        return -1;
    }

    public static int recursiveSearch(int[] searchArray, int target, int lo, int hi) {

        int mid;
        
        if (hi >= lo && lo <= searchArray.length - 1) {
            mid = lo + (hi - lo)/2;
            if (searchArray[mid] == target) {
                return mid;
            } else if (searchArray[mid] < target) {
                return recursiveSearch(searchArray, target, mid + 1, hi);
            } else if (searchArray[mid] > target) {
                return recursiveSearch(searchArray, target, lo, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] sampleArray;

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int target = Integer.parseInt(br.readLine());
            br.readLine();

            Stream<String> stringStream = br.lines();

            sampleArray = stringStream.filter(t -> t != null).mapToInt(t -> Integer.parseInt(t)).toArray();

            br.close();

            System.out.println(search(sampleArray, target));
            System.out.println(recursiveSearch(sampleArray, target, 0, sampleArray.length - 1));

           
        } catch (IOException e) {
            System.out.println("Error with Buffered Reader");
        }
    }
}