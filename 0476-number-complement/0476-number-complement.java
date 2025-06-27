class Solution {
    public int findComplement(int n) {
        int mask=0;
        int temp =n;
        while(temp>0){
            mask<<=1;
            mask|=1;
        
         temp>>=1;
        }
        return n^mask;
    }
}