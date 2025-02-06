class Solution {
    public int findFinalValue(int[] nums, int original) {
       Hashset<Integer>set = new Hashset<>();
       for(int num:nums){
        set.push(num);
       }
       while(set.contains(original)){
        original*=2;

       }
       return original;
    }
}