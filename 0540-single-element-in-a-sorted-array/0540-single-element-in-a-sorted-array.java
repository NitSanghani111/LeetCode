class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int ans = 0; //o(n)
        // for(int i=0; i<nums.length; i++) {
        //     ans = ans ^ nums[i];
        // }
        // return ans;


        //approch 2 using Binary Serch o(logn)
  
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure 'mid' is even to compare pairs correctly
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if mid and mid+1 form a valid pair
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Move right
            } else {
                right = mid; // Move left
            }
        }

        return nums[left]; // 'left' points to the single element
    }
}



