package com.leony.sections;

import com.leony.fixtures.ArraysFixtures;
import com.leony.questions.ArraysQuestions;

public class ArraysSection {
    private ArraysQuestions arraysQuestions = new ArraysQuestions();

    public void hourGlassSum() {
        Integer sum = arraysQuestions.hourGlassSum(ArraysFixtures.HOUR_GLASS_2D_ARRAY_CORRECT);
        System.out.println("The sum for the hour glass sum is: " + sum);
    }
}
