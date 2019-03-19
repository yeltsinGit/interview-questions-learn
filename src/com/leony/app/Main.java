package com.leony.app;

import com.leony.questions.ArraysQuestions;
import com.leony.sections.ArraysSection;

public class Main {
    public static void main(String[] args) {
        arraysQuestions();
    }

    private static void arraysQuestions() {
        ArraysSection arraysSection = new ArraysSection();

        printMessage("ArraysSection: hour glass sum 2D array");
        arraysSection.hourGlassSum();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
