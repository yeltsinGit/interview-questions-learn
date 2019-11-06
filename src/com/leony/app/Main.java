package com.leony.app;

import com.leony.arrays.ArraysSection;

public class Main {
    public static void main(String[] args) {
        arraysQuestions();
    }

    private static void arraysQuestions() {
        ArraysSection arraysSection = new ArraysSection();

        printMessage("ArraysSection: hourGlass sum 2D array");
        arraysSection.hourGlassSum();

        printMessage("ArraysSection: left rotation array by 1");
        arraysSection.leftRotation();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
