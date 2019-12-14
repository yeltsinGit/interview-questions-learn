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
    public static final int[] FIND_MISSING_NUMBER_ARRAY = {1, 2, 3, 4, 5, 0, 7, 8, 9, 10};
    public static final int[] PAIR_WITH_GIVEN_SUM_ARRAY = {1, 3, 4, 5, 9, 11};
    public static final String[] FIND_DUPLICATES_ARRAY_CORRECT = {"abc", "java", "javahungry", "java", "javahungry"};
    public static final String[] FIND_DUPLICATES_ARRAY_INCORRECT = {"abc", "java", "javahungry"};
    public static final int[] REVERSE_ARRAY = {1, 2, 3, 4, 5};
    public static final int[] REVERSED_ARRAY = {5, 4, 3, 2, 1};
    public static final int[] SECOND_MAX_ARRAY = {1, 4, 2, 12, 8, 10, 9};
}
