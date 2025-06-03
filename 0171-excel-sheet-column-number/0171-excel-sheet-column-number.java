class Solution {
    public int titleToNumber(String columnTitle) {
        int colno =0;
      for(char c : columnTitle.toCharArray()){
        colno = colno*26 + (c-'A'+1);

      } 
      return colno;
    }
}