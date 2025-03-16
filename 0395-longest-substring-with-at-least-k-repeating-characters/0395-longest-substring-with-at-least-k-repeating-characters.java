class Solution {
    public int longestSubstring(String s, int k) {
           int n = s.length();
        int maxLen = 0;

        for (int uniqueChars = 1; uniqueChars <= 26; uniqueChars++) {
            int[] freq = new int[26];
            int left = 0, right = 0;
            int countAtLeastK = 0; 
            int unique = 0; 

            while (right < n) {
                if (unique <= uniqueChars) {
                    int idx = s.charAt(right) - 'a';
                    if (freq[idx] == 0) unique++; 
                    freq[idx]++;
                    if (freq[idx] == k) countAtLeastK++; 
                    right++;
                } else {
                    int idx = s.charAt(left) - 'a';
                    if (freq[idx] == k) countAtLeastK--; 
                    freq[idx]--;
                    if (freq[idx] == 0) unique--; 
                    left++;
                }

                if (unique == uniqueChars && unique == countAtLeastK) {
                    maxLen = Math.max(maxLen, right - left);
                }
            }
        }
        return maxLen;
    }
}