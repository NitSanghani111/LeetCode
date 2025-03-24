class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int []  freq = new int[nums.length+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>=2){
                list.add(nums[i]);
            }
        }
        return list;

    }
}