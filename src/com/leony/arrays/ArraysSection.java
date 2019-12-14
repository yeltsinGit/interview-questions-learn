package com.leony.arrays;
import java.util.Arrays;
import java.util.List;

import static com.leony.util.Utils.printMessage;

public class ArraysSection {
    private ArraysQuestions arraysQuestions = new ArraysQuestions();

    public void run() {
        hourGlassSum();
        leftRotation();
        findMissingNumber();
        findPairWithGivenSum();
        findDuplicates();
        reverse();
        findSecondMax();
    }

    private void hourGlassSum() {
        printMessage("ArraysSection: hourGlass sum 2D array");
        Integer sum = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_CORRECT);
        System.out.println("The sum for the hour glass sum is: " + sum);
    }

    private void leftRotation() {
        printMessage("ArraysSection: left rotation array by 1");
        int[] rotatedArr = arraysQuestions.leftRotation(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL, 3);
        System.out.println("The array before rotation: " + Arrays.toString(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL));
        System.out.println("The array after rotation: " + Arrays.toString(rotatedArr));
    }

    private void findMissingNumber() {
        printMessage("ArraysSection: find a missing number in integer array");
        int missingNumber = arraysQuestions.findMissingNumber(ArraysFixtures.FIND_MISSING_NUMBER_ARRAY);
        System.out.println("The missing number is: " + missingNumber);
    }

    private void findPairWithGivenSum() {
        printMessage("ArraysSection: find pair with given sum in an array");
        int[] indexes = arraysQuestions.findPairWithGivenSum(ArraysFixtures.PAIR_WITH_GIVEN_SUM_ARRAY, 10);
        System.out.println("The indexes are: " + Arrays.toString(indexes));
    }

    private void findDuplicates() {
        printMessage("ArraysSection: find duplicates in an array");
        List<String> duplicates = arraysQuestions.findDuplicates(ArraysFixtures.FIND_DUPLICATES_ARRAY_CORRECT);
        System.out.println("The duplicates are: " + duplicates.toString());
    }

    private void reverse() {
        printMessage("ArraysSection: reverse an array");
        int[] reversedArray = arraysQuestions.reverse(ArraysFixtures.REVERSE_ARRAY);
        System.out.println("The reversed array is: " + Arrays.toString(reversedArray));
    }

    private void findSecondMax() {
        printMessage("ArraysSection: find second maximum number an array");
        int secondMax = arraysQuestions.findSecondMax(ArraysFixtures.SECOND_MAX_ARRAY);
        System.out.println("The second maximum number is: " + secondMax);
    }
}
