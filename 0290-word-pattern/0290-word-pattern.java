class Solution {
    public boolean wordPattern(String pattern, String s) {
     HashMap<Character,String>chartoword = new HashMap<>();
     HashMap<String , Character>wordtochar = new HashMap<>(); 
    String [] arr = s.split(" ");

    if(pattern.length() != arr.length) return false;
    for(int i =0;i<pattern.length();i++){
       char c = pattern.charAt(i);
       String w = arr[i];
        if(chartoword.containsKey(c)){
            if(!chartoword.get(c).equals(w)) return false;
        }
        else {
            if(wordtochar.containsKey(w)){
            if(wordtochar.get(w)!=c) return false;
            }
         chartoword.put(c,w);
            wordtochar.put(w,c);
        }


    }
      return true;
    }
}