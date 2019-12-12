package com.leony.arrays;

import java.util.*;

public class ArraysQuestions {
    /**
     * Calculate the highest hourGlass sum in 2D array
     * hourglass is in the following form
     * a b c
     *   d
     * e f g
     * e.g. in the following 2D array
     * -9 -9 -9  1 1 1
     *  0 -9  0  4 3 2
     * -9 -9 -9  1 2 3
     *  0  0  8  6 6 0
     *  0  0  0 -2 0 0
     *  0  0  1  2 4 0
     *  highest hourGlass sum is 28
     *  0 4 3
     *   1
     * 8 6 6
     */
    public Integer hourGlassSum(int[][] arr) {
        if (arr.length < 3 || arr[0].length < 3) return null;

        Integer sum = null;
        int tempSum = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = 0; j < arr[i].length - 3; j++) {
                tempSum = 0;
                tempSum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                tempSum += arr[i + 1][j + 1];
                tempSum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum == null) {
                    sum = tempSum;
                } else if (tempSum > sum) {
                    sum = tempSum;
                }
            }
        }

        return sum;
    }

    /**
     * Rotate the array left n times.
     * e.g { 1 2 3 4 5 } becomes { 2 3 4 5 1 } with n = 1
     */
    public int[] leftRotation(int[] arr, int numOfRotations) {
        int size = arr.length;
        int[] resultArr = new int[size];

        if (numOfRotations > size) {
            numOfRotations = numOfRotations % size;
        }

        for (int i = 0; i < numOfRotations; i++) {
            resultArr[size - (Math.abs(i - numOfRotations))] = arr[i];
        }

        for (int j = 0; j < size - numOfRotations; j++) {
            resultArr[(size - 1) - numOfRotations - j] = arr[(size - 1) - j];
        }

        return resultArr;
    }

    /**
     * Find a missing number in an array of integers,
     *  e.g in { 1 2 3 0 5 } array '4' is the missing number.
     */
    public int findMissingNumber(int arr[]) {
        int sum = 0;
        int expectedSum = 0;
        for (int i = 1; i <= arr.length; i ++) {
            sum += arr[i - 1];
            expectedSum += i;
        }
        return expectedSum - sum;
    }

    /**
     * Given an unsorted array of integers, find a pair with given sum in it.
     * E.g. for {8, 7, 2, 5, 3, 1} and sum = 10 the output will be:
     * Pair found at index 0 and 2 (8 + 2) or at index 1 and 4 (7 + 3)
     *
     * === Alternative solution ===
     * The idea is to sort the given array in ascending order and maintain search space by maintaining two indices
     * (low and high) that initially points to two end-points of the array
     */
    public int[] findPairWithGivenSum( int arr[], int sum) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int rem = sum - curr;
            if (map.get(rem) == null) {
                map.put(curr, i);
            } else {
                result[0] = map.get(rem);
                result[1] = i;
                return result;
            }
        }
        return null;
    }

    /**
     * Find duplicates in a given array.
     * E.g. given an array {"abc", "java", "javahungry", "java", "javahungry"} the output will be "java" and "javahungry"
     */
    public List<String> findDuplicates(String arr[]) {
        List<String> duplicates = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    duplicates.add(arr[i]);
                }
            }
        }
        return duplicates;
    }

    /**
     * Find duplicates in a given array (Alternative solution).
     */
    public List<String> findDuplicatesAltSolution(String arr[]) {
        List<String> duplicates = new ArrayList();
        Set<String> set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }

    /**
     * Reverse a given array.
     * E.g. given an array {1, 2, 3, 4, 5} the output will be {5, 4, 3, 2, 1}
     */
    public int[] reverse(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[(length - 1) - i];
            arr[(length - 1) - i] = temp;
        }
        return arr;
    }
}
