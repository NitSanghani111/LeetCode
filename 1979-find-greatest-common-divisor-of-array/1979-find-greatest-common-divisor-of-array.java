class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int sm = nums[0];
        int large = nums[nums.length - 1];
        for(int i = sm; i>=1;i--){
            if(sm%i==0  && large%i==0){
                return i;
            }
        }
        return 1;
    }
}