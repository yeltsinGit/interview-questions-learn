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
}
