package com.leony.test;

import com.leony.strings.StringsFixtures;
import com.leony.strings.StringsQuestions;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringsQuestionsTest {
    private StringsQuestions stringsQuestions = new StringsQuestions();

    @Test
    public void testAnagram() {
        // correct 1
        Boolean isAnagram1 = stringsQuestions.checkAnagrams(StringsFixtures.ANAGRAM_FIRST_STRING, StringsFixtures.ANAGRAM_SECOND_STRING);
        assertTrue(isAnagram1);

        // correct 2
        Boolean isAnagram2 = stringsQuestions.checkAnagrams(StringsFixtures.ANAGRAM_FIRST_STRING, StringsFixtures.ANAGRAM_SECOND_STRING_WITH_WHITESPACES);
        assertTrue(isAnagram2);

        // incorrect
        Boolean isAnagram3 = stringsQuestions.checkAnagrams(StringsFixtures.ANAGRAM_FIRST_STRING, StringsFixtures.ANAGRAM_FIRST_STRING + "1");
        assertFalse(isAnagram3);
    }

    @Test
    public void testPalindrome() {
        // correct
        Boolean isPalindrome1 = stringsQuestions.checkPalindrome(StringsFixtures.PALINDROME_STRING);
        assertTrue(isPalindrome1);

        // incorrect
        Boolean isPalindrome2 = stringsQuestions.checkPalindrome(StringsFixtures.PALINDROME_STRING + "1");
    }


    @Test
    public void testPermutations() {
        // correct
        String permutations = stringsQuestions.getPermutations(StringsFixtures.PERMUTATIONS_SOURCE_STRING);
        assertEquals(StringsFixtures.PERMUTATIONS_ALL_STRINGS, permutations);
    }
}
