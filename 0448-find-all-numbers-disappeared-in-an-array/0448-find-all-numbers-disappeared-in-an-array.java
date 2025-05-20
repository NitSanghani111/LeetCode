class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Mark visited numbers as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert number to index
            if (nums[index] > 0) {
                nums[index] = -nums[index];    // Mark it as visited
            }
        }

        // Step 2: Find all indices that were never marked (i.e., still positive)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);             // +1 to convert index to number
            }
        }

        return result;
    }
}
