class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int maxsofar = nums[0];
        int minsofar = nums[0];
        int maxprod= nums[0];
        for(int i=1;i<n;i++){
            int num = nums[i];
            if(num <0 ){
                int temp = maxsofar;
                maxsofar = minsofar;
                minsofar = temp;

            }
            maxsofar = Math.max(num,num*maxsofar);
            minsofar = Math.min(num,num*minsofar);
            maxprod = Math.max(maxprod,maxsofar);
        }
        return maxprod;
        
    }
}