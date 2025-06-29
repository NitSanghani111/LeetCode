class Solution {
      public   boolean  eatbanana(int[] piles,int h ,int mid ){
    int totalh = 0;
    for(int pile:piles){
        totalh += Math.ceil((double)pile/mid);
    }
    return totalh <=h;
   }
    public int minEatingSpeed(int[] piles, int h) {
  
    int low =1;
     int high=0;
      for(int pile: piles){
        high = Math.max(high,pile);
      }
     while(low < high){
        int mid = low+(high-low)/2;
       if(eatbanana(piles,h,mid)){
            high = mid;
       }                              
       else{
        low = mid+1;
       }
     }
return low;
    

 
   }
}




  //   int maxpiles=0;
    //   for(int pile: piles){
    //     maxpiles = Math.max(maxpiles,pile);
    //   }

    //   for(int k=1;k<=maxpiles;k++){
    //     int hour = 0;
    //     for(int pile: piles){
    //         hour+=Math.ceil((double)pile/k);
    //     }
    //     if(hour<=h){
    //         return k;
    //     }

    //   }
    //   return maxpiles; // TLE;
   