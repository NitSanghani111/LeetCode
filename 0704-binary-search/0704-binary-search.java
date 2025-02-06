class Solution {
    public int search(int[] nums, int target) {
        int startp = 0;
        int endp = nums.length - 1;
        while (startp <= endp) {
            int mid = (startp + endp) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                startp = mid + 1;
            } else {
                endp = mid - 1;
            }
        }

        return -1;

    }
}