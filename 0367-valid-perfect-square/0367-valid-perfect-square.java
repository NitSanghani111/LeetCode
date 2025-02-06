class Solution {
    public boolean isPerfectSquare(int num) {
      if(num<2){
        return true;

      }
      else{
        long left=1;long right=num;
        while(left <= right){
            long mid = left + (right-left)/2;
            long squre =mid*mid;
            if(num == squre){
                return true;
            }
            else if(num > squre){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

      }
      return false;

    }
}