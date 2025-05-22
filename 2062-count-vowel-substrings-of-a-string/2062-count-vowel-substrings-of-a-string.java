class Solution {
    public int countVowelSubstrings(String word) {
     int count =0;
     HashSet<Character>hs = new HashSet<>();

        for(int i=0;i<=word.length()-4;i++){
            hs.clear();
            for(int j=i;j<word.length();j++){
                char ch = word.charAt(j);
                if("aeiou".contains(String.valueOf(ch))){
                    hs.add(ch);
                    if(hs.size()==5){
                        count++;
                    }
                }
                else{
                    break;
                }
            }
        }
          

     return count;   
    }
}