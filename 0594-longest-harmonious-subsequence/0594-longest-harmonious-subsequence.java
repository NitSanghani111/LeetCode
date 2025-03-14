class Solution {
    public int findLHS(int[] nums) {
        int maxlen =0;
        for(int i =0; i<nums.length;i++){
            int count =0;
            boolean hasseq = false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i] || nums[j] == nums[i] + 1){
                    count++;
                    if(nums[j] == nums[i] + 1){
                        hasseq= true;
                    }
                }
            }
            if(hasseq){
                maxlen = Math.max(maxlen, count);
            }
        }
        return maxlen;
    }
}