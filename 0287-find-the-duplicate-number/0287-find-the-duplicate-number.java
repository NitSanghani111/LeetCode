class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(!hs.add(nums[i])){
                return nums[i];
            }

        }
             return n;
    }
}