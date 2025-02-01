class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int actualsum = (range*(range+1))/2;

        int cursum = 0;
        for(int i=0;i< range ;i++){
            cursum = cursum + nums[i];

        }
        int ans = actualsum - cursum;
        return ans;
    }

}