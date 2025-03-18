class Solution {
    public String addBinary(String a, String b) {
     StringBuilder res = new StringBuilder();
     int i= a.length()-1;
     int j = b.length()-1;

     int carray =0;
        while(i>=0 || j>=0 || carray >0){
            int b1 = (i>=0) ? a.charAt(i)-'0' :0;
            int b2 = (j>=0) ? b.charAt(j)-'0' :0;
            int sum = b1+b2+carray;
            res.append(sum % 2);
            carray = sum /2;
            i--;j--;
        }        
        return res.reverse().toString();
    }
}