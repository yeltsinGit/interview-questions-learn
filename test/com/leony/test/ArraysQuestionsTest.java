package com.leony.test;

import com.leony.arrays.ArraysFixtures;
import com.leony.arrays.ArraysQuestions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ArraysQuestionsTest {
    private ArraysQuestions arraysQuestions = new ArraysQuestions();

    @Test
    public void testHourGlassSum() {
        // correct
        Integer sum1 = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_CORRECT);
        assertEquals(Integer.parseInt(sum1.toString()), 28);

        // incorrect
        Integer sum2 = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_INCORRECT);
        assertNull(sum2);
    }

    @Test
    public void testLeftRotation() {
        // correct
        int[] rotatedArr1 = arraysQuestions.leftRotation(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL, 1);
        assertArrayEquals(rotatedArr1, ArraysFixtures.LEFT_ROTATION_ARRAY_ROTATED_1);

        // correct2
        int[] rotatedArr2 = arraysQuestions.leftRotation(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL, 5);
        assertArrayEquals(rotatedArr2, ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL);

        // correct3
        int[] rotatedArr3 = arraysQuestions.leftRotation(ArraysFixtures.LEFT_ROTATION_ARRAY_ORIGINAL, 8);
        assertArrayEquals(rotatedArr3, ArraysFixtures.LEFT_ROTATION_ARRAY_ROTATED_3);
    }

    @Test
    public void testFindMissingNumber() {
        // correct
        int missingNumber1 = arraysQuestions.findMissingNumber(ArraysFixtures.FIND_MISSING_NUMBER_ARRAY);
        assertEquals(missingNumber1, 6);
    }

    @Test
    public void testFindPairWithGivenSum() {
        // correct
        int[] indexes1 = arraysQuestions.findPairWithGivenSum(ArraysFixtures.PAIR_WITH_GIVEN_SUM_ARRAY, 10);
        int[] correct1;
        correct1 = new int[] {0, 4};
        assertArrayEquals(indexes1, correct1);

        // correct2
        int[] indexes2 = arraysQuestions.findPairWithGivenSum(ArraysFixtures.PAIR_WITH_GIVEN_SUM_ARRAY, 11);
        assertNull(indexes2);
    }

    @Test
    public void testFindDuplicates() {
        String[] correct = new String[] {"java", "javahungry"};

        // correct
        List<String> duplicates1 = arraysQuestions.findDuplicates(ArraysFixtures.FIND_DUPLICATES_ARRAY_CORRECT);
        assertArrayEquals(duplicates1.toArray(), correct);

        // incorrect
        List<String> duplicates2 = arraysQuestions.findDuplicates(ArraysFixtures.FIND_DUPLICATES_ARRAY_INCORRECT);
        assertEquals(duplicates2.size(), 0);

        // ======= Alternative solution ==========

        // correct
        List<String> duplicates3 = arraysQuestions.findDuplicatesAltSolution(ArraysFixtures.FIND_DUPLICATES_ARRAY_CORRECT);
        assertArrayEquals(duplicates3.toArray(), correct);

        // incorrect
        List<String> duplicates4 = arraysQuestions.findDuplicatesAltSolution(ArraysFixtures.FIND_DUPLICATES_ARRAY_INCORRECT);
        assertEquals(duplicates4.size(), 0);
    }

    @Test
    public void testReverse() {
        // correct
        int[] reversedArray = arraysQuestions.reverse(ArraysFixtures.REVERSE_ARRAY);
        assertArrayEquals(reversedArray, ArraysFixtures.REVERSED_ARRAY);
    }

    @Test
    public void testSecondMax() {
        // correct
        int secondMax = arraysQuestions.findSecondMax(ArraysFixtures.SECOND_MAX_ARRAY);
        assertEquals(secondMax, 10);
    }
}
