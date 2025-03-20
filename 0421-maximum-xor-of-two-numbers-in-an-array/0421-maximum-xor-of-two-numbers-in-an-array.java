class Solution {
    public int findMaximumXOR(int[] nums) {
  int maxXor = 0, mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i); 

            HashSet<Integer> prefixes = new HashSet<>();
            for (int num : nums) {
                prefixes.add(num & mask);  
            }

            int possibleMaxXor = maxXor | (1 << i); 

            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ possibleMaxXor)) { 
                    maxXor = possibleMaxXor; 
                    break;
                }
            }
        }
        return maxXor;
    }
}