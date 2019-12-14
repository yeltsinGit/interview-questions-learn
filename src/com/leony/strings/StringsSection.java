package com.leony.strings;

import com.leony.arrays.ArraysFixtures;

import static com.leony.util.Utils.printMessage;

public class StringsSection {
    private StringsQuestions stringsQuestions = new StringsQuestions();

    public void run() {
        anagram();
    }

    private void anagram() {
        printMessage("StringsSection: check if two strings are anagram");
        Boolean isAnagram = stringsQuestions.checkAnagrams(StringsFixtures.ANAGRAM_FIRST_STRING, StringsFixtures.ANAGRAM_SECOND_STRING);
        System.out.println("Two strings are anagram: " + isAnagram);
    }
}
