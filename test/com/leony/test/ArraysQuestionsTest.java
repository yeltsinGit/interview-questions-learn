package com.leony.test;

import com.leony.fixtures.ArraysFixtures;
import com.leony.questions.ArraysQuestions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysQuestionsTest {
    private ArraysQuestions arraysQuestions = new ArraysQuestions();

    @Test
    public void testHourGlassSum2DArray() {
        // correct
        int sum1 = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_CORRECT);
        assertEquals(sum1, 28);

        // incorrect
        int sum2 = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_INCORRECT);
        assertNull(sum2);
    }
}
