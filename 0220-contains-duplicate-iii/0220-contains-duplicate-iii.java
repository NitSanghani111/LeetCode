import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k <= 0 || t < 0) return false; // Edge cases
        
        TreeSet<Long> set = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            Long floor = set.floor((long) nums[i]);   // Largest number <= nums[i]
            Long ceil = set.ceiling((long) nums[i]);  // Smallest number >= nums[i]
            
            if ((floor != null && nums[i] - floor <= t) || 
                (ceil != null && ceil - nums[i] <= t)) {
                return true;
            }
            
            set.add((long) nums[i]); // Insert current number into TreeSet
            
            if (i >= k) {  // Remove the element that's out of range k
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
