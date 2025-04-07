class Solution {
    public int findLUSlength(String[] strs) {
     int maxlen = -1;
     for(int i=0;i< strs.length;i++){
        boolean flag  = false ;
        int curlen = strs[i].length();
        for(int j=0;j<strs.length;j++){
            if(i!=j && issubseq(strs[i], strs[j])){
                flag = true;
                break;
            }
        }        if(!flag){
            maxlen = Math.max(curlen, maxlen);
        }

     }   
     return maxlen;
    }
    public boolean issubseq(String a, String b){
        if(a.equals(b)) return true;
        int i=0; 
        int j=0;
        while(i < a.length() && j<b.length()){
            if(a.charAt(i)== b.charAt(j++)){
                i++;
            }
        }
        return i==a.length();
    }
}