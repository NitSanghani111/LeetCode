class Solution {
    public int subarraySum(int[] nums, int k) {
        int noofsub=0;
        int n = nums.length;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
           int sum=0;
           for(int j=i;j<n;j++){
            sum+=nums[j];
            if(sum==k){
                noofsub++;
            }

           }
          
        }
        return noofsub;
    }
}