package com.leony.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public String getPermutations(String str) {
        if (str == null) return null;
        if (str.length() < 2) System.out.println(str);

        List<String> permutations = new ArrayList();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    permutations.add(getPerm(arr, i, j));
                }
            }
        }
        return permutations.stream().collect(Collectors.joining(" "));
    }

    private String getPerm(char[] arr, int indexFrom, int indexTo) {
        char[] clone = arr.clone();
        char temp = clone[indexFrom];
        clone[indexFrom] = clone[indexTo];
        clone[indexTo] = temp;
        return String.valueOf(clone);
    }
}
