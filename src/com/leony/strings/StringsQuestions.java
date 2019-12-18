package com.leony.strings;

import java.util.HashMap;
import java.util.Map;

public class StringsQuestions {
    /**
     * Check if two given strings are anagrams, meaning contain same letters in different order.
     * E.g. "Army" and "Mary" is anagram of each other.
     * @return
     */
    public boolean checkAnagrams(String first, String second) {
        // Check nulls or empty arrays
        if ((first == null || first.isEmpty()) || (second == null || second.isEmpty())) return false;

        // remove all whitespaces and convert to lowercase before comparing
        char[] firstChars = first.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] secondChars = second.replaceAll("\\s", "").toLowerCase().toCharArray();
        Map<Character, Integer> charsMap = new HashMap();

        for (char i : firstChars) {
            if (charsMap.get(i) == null) {
                charsMap.put(i, 1);
            } else {
                charsMap.put(i, charsMap.get(i) + 1);
            }
        }

        for (char j : secondChars) {
            if (charsMap.get(j) == null) {
                return false;
            } else {
                charsMap.put(j, charsMap.get(j) - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
            if (entry.getValue() != 0) return false;
        }
        return true;
    }

    /**
     * Check if a given string is a palindrome. A palindrome is a word that can be read forward and backwards.
     * E.g. "radar" or "madam" is a palindrome, and "java" is not.
     */
    public Boolean checkPalindrome(String str) {
        if (str == null || str.length() < 2) return false;

        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 -i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Print all permutations of a given string.
     * E.g. for "ABC" the output will be "ABC ACB BAC BCA CBA CAB".
     */
    public void printPermutations(String str) {
        printPermutations(str, 0, str.length() - 1);
    }

    private void printPermutations(String str, int left, int right) {
        if (str == null) return;
        if (str.length() < 2)  {
            System.out.println(str);
            return;
        }

        if (left == right) {
            System.out.println(str);
        } else {
            for(int i = left; i <= right; i++) {
                str = swap(str, left, i);
                printPermutations(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    private String swap(String str, int i, int j) {
        char[] clone = str.toCharArray().clone();
        char temp = clone[i];
        clone[i] = clone[j];
        clone[j] = temp;
        return String.valueOf(clone);
    }
}
