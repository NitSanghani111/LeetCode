class Solution {
    public int maximumSum(int[] nums) {
       HashMap<Integer,Integer> hs = new HashMap<>();
       int res=-1;
       for(int i=0;i<nums.length;i++){
        int s = sum(nums[i]);
        if(hs.containsKey(s)){
            res = Math.max(res,nums[i]+hs.get(s));
            if(nums[i] > hs.get(s)){
                hs.put(s,nums[i]);
            }

        }
        else{
           hs.put(s,nums[i]);
        }
       }
       return res;
      }
      private int sum(int n){
        int sum=0;
        while(n > 0){
             sum+=n%10;
             n=n/10;
        }
        return sum;
      }
}