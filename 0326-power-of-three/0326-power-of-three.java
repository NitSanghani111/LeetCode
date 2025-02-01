class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        else if (n==3){
            return true;
        }
        while(n%3==0){
            n=n/3;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}