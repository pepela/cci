package chapter_1;

import java.util.HashMap;
import java.util.Map;


public class PalindromePermutation {

    /*
    * time - O(n)
    *
    * note - can use single integer, bit vector
    * */
    public boolean solve(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c < 'a' || c > 'z') {
                continue;
            }
            int count = charFrequencyMap.getOrDefault(c, 0);
            charFrequencyMap.put(c, ++count);
        }

        boolean fail = false;
        for (Character c : charFrequencyMap.keySet()) {
            if (charFrequencyMap.get(c) % 2 != 0) {
                if (fail) {
                    return false;
                }
                fail = true;
            }
        }

        return true;
    }
}
