class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<0){
            return false;
        }
        long  a =0; long  b=(long)Math.sqrt(c);
        while(a<b ){
            long  cal = a*a +b*b;
            if(cal==c){
                return true;
            }
            else if(cal < c){
                a++;
            }
            else{
                b--;
            }
        }
return false;
    }
}