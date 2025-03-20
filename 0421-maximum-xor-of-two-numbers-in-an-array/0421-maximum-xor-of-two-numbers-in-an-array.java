class Solution {
    public int findMaximumXOR(int[] nums) {
  int maxXor = 0, mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i); // Update the mask to consider one more bit (MSB to LSB)

            HashSet<Integer> prefixes = new HashSet<>();
            for (int num : nums) {
                prefixes.add(num & mask);  // Store only the first 'i' bits of numbers
            }

            int possibleMaxXor = maxXor | (1 << i); // Assume we can set this bit in XOR

            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ possibleMaxXor)) { // Check if complement exists
                    maxXor = possibleMaxXor; // Update maxXor
                    break;
                }
            }
        }
        return maxXor;
    }
}