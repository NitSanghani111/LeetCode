class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int idx = -1;
      
        int [] arr = new int[nums.length];
          Arrays.fill(arr,idx);
        for(int i=0;i<nums.length;i++){
            for(int j = 1;j<nums.length;j++){
                int k =(i+j)%nums.length;
                if(nums[k]>nums[i]){
                    arr[i]= nums[k];
                    break;
                }
            }}
            return arr;
    }
}