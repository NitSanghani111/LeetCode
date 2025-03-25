class Solution {
    public String reverseStr(String s, int k) {
     int n = s.length();
     StringBuilder sb = new StringBuilder();
     for(int i=0;i<n;i+=2*k){
        StringBuilder res  = new StringBuilder(s.substring(i,Math.min(i+k,n)));
        sb.append(res.reverse());
        if(i+k<n){
            sb.append(s.substring(i+k,Math.min(i + 2 * k,n)));
        }

     }
     return sb.toString();
    }
}