class Solution {
    public int alternateDigitSum(int n) {
        String str = Integer.toString(n);

        int res =0;
        for(int i=0;i<str.length();i++){
             int  digit = str.charAt(i)-'0';

             if(i%2==0){
             res+= digit;
             }
             else{

            res -= digit;
             }
        }   
       return res;
    }
}