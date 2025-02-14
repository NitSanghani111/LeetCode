import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max_length = 0;
        Set<Character> set = new HashSet<>();  // Using HashSet for O(1) lookup
        
        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;  // Move the left pointer
            }
            set.add(s.charAt(end));
            max_length = Math.max(max_length, end - start + 1);  // Update max_length
        }
        
        return max_length;
    }
}
