class Solution {
    public int minimumMoves(String s) {
        int count =0;
        int i =0;
        while(i<s.length()){
             if(s.charAt(i)=='X'){
                i=i+3;
                count++;

            }
            else{
                i++;
            }
        }
        return count;

    }
}