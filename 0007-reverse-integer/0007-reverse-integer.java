class Solution {
    public int reverse(int x) {
    int nums = Math.abs(x);

    int rev =0;
    while(nums!=0){
        int last = nums%10;
        if(rev >(Integer.MAX_VALUE - last)/10){
            return 0;
        }
        rev =rev*10 + last;
        nums = nums/10;
    }
    return (x<0) ?(-rev) : rev;
    }
}