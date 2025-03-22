class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n= nums.length;
        for(int num : nums){
            if(num>0){
                  hs.add(num);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                return i;
            }
        }
return n+1;

    }
}