package com.leony.arrays;

import com.leony.arrays.ArraysFixtures;
import com.leony.arrays.ArraysQuestions;

import java.util.Arrays;

public class ArraysSection {
    private ArraysQuestions arraysQuestions = new ArraysQuestions();

    public void hourGlassSum() {
        Integer sum = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_CORRECT);
        System.out.println("The sum for the hour glass sum is: " + sum);
    }

    public void leftRotation() {
        int[] rotatedArr = arraysQuestions.leftRotation(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL, 3);
        System.out.println("The array before rotation: " + Arrays.toString(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL));
        System.out.println("The array after rotation: " + Arrays.toString(rotatedArr));
    }
}
