package com.etherealhazel.algorithms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchDesc {

    public static int search(int[] searchArray, int target) {
        int hi = 0, lo = searchArray.length - 1, mid;

        while (hi <= lo) {
            mid = hi + (lo - hi)/2;
            if (searchArray[mid] == target) {
                return mid;
            } else if (searchArray[mid] < target) {
                lo = mid - 1;
            } else if (searchArray[mid] > target) {
                hi = mid + 1;
            }
        }
        return -1;
    }

    public static int recursiveSearch(int[] searchArray, int target, int hi, int lo) {

        int mid;

        if (hi <= lo && hi <= searchArray.length - 1) {
            mid = hi + (lo - hi)/2;
            if (searchArray[mid] == target) {
                return mid;
            } else if (searchArray[mid] < target) {
                return recursiveSearch(searchArray, target, hi, mid - 1);
            } else if (searchArray[mid] > target) {
                return recursiveSearch(searchArray, target, mid + 1, lo);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int target = Integer.parseInt(br.readLine());
            br.readLine();

            int[] searchArray = br.lines().filter(t -> t != null).mapToInt(t -> Integer.parseInt(t)).toArray();

            br.close();

            System.out.println(search(searchArray, target));
            System.out.println(recursiveSearch(searchArray, target, 0, searchArray.length - 1));
            
        } catch (IOException e) {
            System.out.println("Error with buffered reader");
        }       
    }    
}
