class Solution {
    public boolean isPalindrome(int x) {
        int num = Math.abs(x);
        int res =0;
        while(num!=0){
            int last = num%10;
            if(res>(Integer.MAX_VALUE-last)/10){
                return false;
            }
            res = res*10 + last;
            num = num/10;
        }
        if(x==res){
            return true;
        }
        else return false;
        
    }
}