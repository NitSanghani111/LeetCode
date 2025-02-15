class Solution {

    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hs = new HashMap<Character,Character>();
         HashMap<Character,Character> ht = new HashMap<Character,Character>();
       for(int i=0;i<s.length();i++){
        char chs = s.charAt(i);
        char cht = t.charAt(i);

        if(hs.containsKey(chs)&& hs.get(chs)!=cht){
            return false;
        }

          
     if(ht.containsKey(cht)&& ht.get(cht)!=chs){
                    return false;
        }

                hs.put(chs,cht);
                ht.put(cht,chs);
             
        
       }
       return true;
    }
}