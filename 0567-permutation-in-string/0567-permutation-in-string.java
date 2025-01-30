class Solution {
  private boolean isFreqSame(int[] freq, int[] windFreq) {
        return Arrays.equals(freq, windFreq);
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq = new int[26]; // Frequency array for s1
        int[] windFreq = new int[26]; // Frequency array for window in s2

        // Fill frequency for s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        // Fill first window in s2
        for (int i = 0; i < windowSize; i++) {
            windFreq[s2.charAt(i) - 'a']++;
        }

        // Check if first window matches
        if (isFreqSame(freq, windFreq)) return true;

        // Slide the window across s2
        for (int i = windowSize; i < s2.length(); i++) {
            windFreq[s2.charAt(i) - 'a']++; // Add new character
            windFreq[s2.charAt(i - windowSize) - 'a']--; // Remove old character

            if (isFreqSame(freq, windFreq)) return true;
        }

        return false;
    }


}