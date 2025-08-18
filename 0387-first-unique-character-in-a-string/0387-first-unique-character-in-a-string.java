class Solution {
    public int firstUniqChar(String s) {
        char ch []  = s.toCharArray();
        int idx =0;
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char x : ch){
           hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int i=0;i<ch.length;i++){
            if(hm.get(ch[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}