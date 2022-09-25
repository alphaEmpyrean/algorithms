package com.etherealhazel.algorithms;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BitonicSearchTest {

    @Nested
    public class StructuredTests {

        @Test
        public void oneElement_TargetPresent() {
            int[] sampleArray = new int[]{10};
            assertEquals(0, BitonicSearch.search(sampleArray, 10, 0, sampleArray.length - 1));
        }
    
        @Test
        public void oneElement_TargetNotPresent() {
            int[] sampleArray = new int[]{10};
            assertEquals(-1, BitonicSearch.search(sampleArray, 20, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {2, 4})
        public void twoElements_Increasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{2, 4};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5})
        public void twoElements_Increasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{2, 4};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {4, 2})
        public void twoElements_Decreasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{4, 2};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5})
        public void twoElements_Decreasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{4, 2};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {2, 4, 6})
        public void threeElements_Increasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{2, 4, 6};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7})
        public void threeElements_Increasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{2, 4, 6};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {6, 4, 2})
        public void threeElements_Decreasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{6, 4, 2};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7})
        public void threeElements_Decreasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{6, 4, 2};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {2, 6, 4})
        public void threeElements_InflectionAtMiddle_TargetsPresent(int target) {
            int[] sampleArray = new int[]{2, 6, 4};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7})
        public void threeElements_InflectionAtMiddle_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{2, 6, 4};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {2, 6, 4, 8})
        public void fourElements_Increasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{2, 6, 4, 8};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9})
        public void fourElements_Increasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{2, 6, 4, 8};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {8, 6, 4, 2})
        public void fourElements_Decreasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{8, 6, 4, 2};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9})
        public void fourElements_Decreasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{8, 6, 4, 2};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {2, 8, 6, 4})
        public void fourElements_InflectionAtMiddleLeft_TargetsPresent(int target) {
            int[] sampleArray = new int[]{2, 8, 6, 4};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9})
        public void fourElements_InflectionAtMiddleLeft_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{2, 8, 6, 4};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {2, 4, 8, 6})
        public void fourElements_InflectionAtMiddleRight_TargetsPresent(int target) {
            int[] sampleArray = new int[]{2, 4, 8, 6};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9})
        public void fourElements_InflectionAtMiddleRight_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{2, 4, 8, 6};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {2, 4, 6, 8, 10})
        public void fiveElements_Increasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{2, 4, 6, 8, 10};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9, 11})
        public void fiveElements_Increasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{2, 4, 6, 8, 10};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {10, 8, 6, 4, 2})
        public void fiveElements_Decreasing_TargetsPresent(int target) {
            int[] sampleArray = new int[]{10, 8, 6, 4, 2};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9, 11})
        public void viveElements_Decreasing_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{10, 8, 6, 4, 2};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {0, 2, 8, 6, 4})
        public void fiveElements_InflectionAtMiddle_TargetsPresent(int target) {
            int[] sampleArray = new int[]{0, 2, 8, 6, 4};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {-1, 1, 3, 5, 7, 9})
        public void fiveElements_InflectionAtMiddle_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{0, 2, 8, 6, 4};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {0, 2, 8, 6, 4})
        public void fiveElements_InflectionAtLeftOfMiddle_TargetsPresent(int target) {
            int[] sampleArray = new int[]{0, 8, 6, 4, 2};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {-1, 1, 3, 5, 7, 9})
        public void fiveElements_InflectionAtLeftOfMiddle_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{0, 8, 6, 4, 2};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {0, 2, 4, 8, 6})
        public void fiveElements_InflectionAtRightOfMiddle_TargetsPresent(int target) {
            int[] sampleArray = new int[]{0, 2, 4, 8, 6};
            assertNotEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }
    
        @ParameterizedTest
        @ValueSource(ints = {-1, 1, 3, 5, 7, 9})
        public void fiveElements_InflectionAtRightOfMiddle_TargetsNotPresent(int target) {
            int[] sampleArray = new int[]{0, 2, 4, 8, 6};
            assertEquals(-1, BitonicSearch.search(sampleArray, target, 0, sampleArray.length - 1));
        }

    }

    @Nested
    public class RandomTests {
        
    }
}
