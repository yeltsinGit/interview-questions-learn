package com.leony.arrays;
import java.util.Arrays;

import static com.leony.util.Utils.printMessage;

public class ArraysSection {
    private ArraysQuestions arraysQuestions = new ArraysQuestions();

    public void run() {
        printMessage("ArraysSection: hourGlass sum 2D array");
        hourGlassSum();

        printMessage("ArraysSection: left rotation array by 1");
        leftRotation();
    }

    private void hourGlassSum() {
        Integer sum = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_CORRECT);
        System.out.println("The sum for the hour glass sum is: " + sum);
    }

    private void leftRotation() {
        int[] rotatedArr = arraysQuestions.leftRotation(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL, 3);
        System.out.println("The array before rotation: " + Arrays.toString(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL));
        System.out.println("The array after rotation: " + Arrays.toString(rotatedArr));
    }
}
