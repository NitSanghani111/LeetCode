import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequency of each character
        HashMap<Character, Integer> freqmap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Sort characters by frequency
        List<Character> chars = new ArrayList<>(freqmap.keySet());
        chars.sort((a, b) -> freqmap.get(b) - freqmap.get(a)); // Descending order

        // Step 3: Build the result string
        StringBuilder str = new StringBuilder();
        for (char ch : chars) {
            str.append(String.valueOf(ch).repeat(freqmap.get(ch))); // Append char multiple times
        }
        return str.toString();
    }
}
