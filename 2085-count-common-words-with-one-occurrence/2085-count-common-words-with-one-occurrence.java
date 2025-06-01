class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word : words1){
            hm.put(word, hm.getOrDefault(word,0)+1);
        }
        for(String word :words2 ){
           Integer freq = hm.get(word);

           if(freq != null && freq <=1){
            hm.put(word,freq-1);
           }
        }
        int count =0;

        for(int val : hm.values()){
            if(val ==0){
                ++count;
            }
        }
        return count;
    }
}