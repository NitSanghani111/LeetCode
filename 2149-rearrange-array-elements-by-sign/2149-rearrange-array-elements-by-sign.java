class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int [] result = new int[n];
      int posidx=0;
      int negidx=1;
      for(int i=0;i<n;i++){
        if(nums[i]>0){
            result[posidx]=nums[i];
            posidx+=2;
        }

      }
      for(int i=0;i<n;i++){
        if(nums[i]<0){
            result[negidx]=nums[i];
            negidx+=2;
        }
      }
      return result;
    }
}