class Solution {
    public int longestOnes(int[] nums, int K) {
        int n = nums.length;
        int l=0, r=0;
        int count =0,maxlen =0;

        if(n < 2 && 0 < K){
            return n;
        }
        while(r< n){
            if(nums[r]==0){
                count++;
            }
            while(K < count){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;

        }
        return maxlen;
    }
}