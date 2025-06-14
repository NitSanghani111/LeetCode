class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        HashSet<Integer>hs = new HashSet<>();
        for(int num : arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int num : hm.values()){
            hs.add(num);
        }
        if(hm.size()!=hs.size()){
            return false;
        }
        return true;
    }
}