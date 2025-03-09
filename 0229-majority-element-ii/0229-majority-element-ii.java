class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer >freqmap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int n= nums.length;
        for(int num :nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);

        }
        for(Map.Entry<Integer,Integer>entry:freqmap.entrySet()){
            if(entry.getValue()> n/3){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}