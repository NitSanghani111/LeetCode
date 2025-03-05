class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0 || nums ==null){
            return 0;

        }
        HashSet<Integer> set = new HashSet<>();
        int larseq =0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int curnum= num;
                int curseq =1;

                while(set.contains(curnum+1)){
                    curnum++;
                    curseq++;
                }
                larseq = Math.max(larseq,curseq);
            }
        }
        return larseq;

    }
}