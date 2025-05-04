class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        HashMap<Character,Integer> hs = new HashMap<>();
      
       for(int i =0;i<n;i++){
        char ch = s.charAt(i);
        hs.put(ch,hs.getOrDefault(ch,0)+1);
       }
       HashSet<Integer>has = new HashSet<>();
       for(char ch :hs.keySet()){
        has.add(hs.get(ch));
       }
       return has.size()==1;
    }
}