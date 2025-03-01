class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hs = new HashMap<>();
        int n = nums.length;

        for(int num :nums){
            hs.put(num, hs.getOrDefault(num,0)+1);
        }
        for(int key:hs.keySet()){
            if(hs.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}