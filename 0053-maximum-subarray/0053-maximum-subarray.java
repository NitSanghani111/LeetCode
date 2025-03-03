class Solution {
     public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize max sum to the first element
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num; // Add current number to sum
            maxSum = Math.max(maxSum, currentSum); // Update max sum if needed
            
            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

}