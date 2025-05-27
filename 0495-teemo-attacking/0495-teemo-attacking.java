class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count =0;
     
        for(int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i]+duration > timeSeries[i+1]){
                count += timeSeries[i+1]-timeSeries[i];

            }
            else{
                count += duration;
            }
        }

        return count + duration;
    } 
}