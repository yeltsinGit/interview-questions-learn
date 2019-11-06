package com.leony.arrays;

public class ArraysFixtures {
    public static final int[][] HOUR_GLASS_2D_ARRAY_CORRECT = {
            {-9, -9, -9, 1, 1, 1},
            {0, -9, 0, 4, 3, 2},
            {-9, -9, -9, 1, 2, 3},
            {0, 0, 8, 6, 6, 0},
            {0, 0, 0, -2, 0, 0},
            {0, 0, 1, 2, 4, 0}
    };
    public static final int[][] HOUR_GLASS_2D_ARRAY_INCORRECT = {
            {1, 2, 3},
            {4, 5, 6}
    };
    public static final int[] LEFT_ROTATION_ARRAY_ORIGINAL = { 1, 2, 3, 4, 5 };
    public static final int[] LEFT_ROTATION_ARRAY_ROTATED_1 = { 2, 3, 4, 5, 1 };
    public static final int[] LEFT_ROTATION_ARRAY_ROTATED_3 = { 4, 5, 1, 2, 3 };
}
