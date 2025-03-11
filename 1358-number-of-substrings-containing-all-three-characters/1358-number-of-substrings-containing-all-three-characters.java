class Solution {
    public int numberOfSubstrings(String s) {
        int [] w =new int[3];
        int n = s.length();
      int left =0,res =0;
      for(int right =0;  right < n;right++){
        w[s.charAt(right)-'a']++;

      

      while(w[0]>0 && w[1]>0 && w[2]>0){
        res += (n - right);
        w[s.charAt(left)-'a']--;
        left++;

      } 
      }
    return res;
    }
}