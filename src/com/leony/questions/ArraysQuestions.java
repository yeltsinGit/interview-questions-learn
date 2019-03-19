package com.leony.questions;

import java.util.Arrays;

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
}
