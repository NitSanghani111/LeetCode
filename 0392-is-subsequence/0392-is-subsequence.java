class Solution {
    public boolean isSubsequence(String s, String t) {
      
     int firstpoint =0;
     int secpoint =0;
     while(firstpoint < s.length() && secpoint < t.length()){
        if(s.charAt(firstpoint)== t.charAt(secpoint)){
            firstpoint++;
        }
        secpoint++;
     }
     return firstpoint == s.length();
    }
}