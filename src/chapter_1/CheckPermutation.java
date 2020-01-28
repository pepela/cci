package chapter_1;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

    /*
     * time - O(n)
     * space - O(n)
     * */
    public boolean solve(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            Character c1 = s1.charAt(i);
            Character c2 = s2.charAt(i);

            int char1Count = 1;
            if (charMap.containsKey(c1)) {
                char1Count = charMap.get(c1);
                char1Count++;
            }
            charMap.put(c1, char1Count);

            int char2Count = -1;
            if (charMap.containsKey(c2)) {
                char2Count = charMap.get(c2);
                char2Count--;
            }
            charMap.put(c2, char2Count);
        }

        for (Character character : charMap.keySet()) {
            if (charMap.get(character) != 0) {
                return false;
            }
        }

        return true;
    }


    public boolean solveForASCII(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCounter = new int[128];

        for (char c : s1.toCharArray()) {
            charCounter[c]++;
        }

        for (char c : s2.toCharArray()) {
            charCounter[c]--;
            if (charCounter[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
