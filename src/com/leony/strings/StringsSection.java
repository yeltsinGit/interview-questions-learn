package com.leony.strings;

import static com.leony.util.Utils.printMessage;

public class StringsSection {
    private StringsQuestions stringsQuestions = new StringsQuestions();

    public void run() {
        anagram();
        palindrome();
        permutations();
    }

    private void anagram() {
        printMessage("StringsSection: check if two strings are anagram");
        Boolean isAnagram = stringsQuestions.checkAnagrams(StringsFixtures.ANAGRAM_FIRST_STRING, StringsFixtures.ANAGRAM_SECOND_STRING);
        System.out.println("Two strings are anagram: " + isAnagram);
    }

    private void palindrome() {
        printMessage("StringsSection: check if string is a palindrome");
        Boolean isPalindrome = stringsQuestions.checkPalindrome(StringsFixtures.PALINDROME_STRING);
        System.out.println("The string is a palindrome: " + isPalindrome);
    }

    private void permutations() {
        printMessage("StringsSection: print permutations of a given string");
        String permutations = stringsQuestions.getPermutations(StringsFixtures.PERMUTATIONS_SOURCE_STRING);
        System.out.println("The string is a palindrome: " + permutations);
    }
}
