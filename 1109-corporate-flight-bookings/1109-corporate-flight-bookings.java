class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
    int [] arr = new int[n+2];
        for(int i=0;i<bookings.length;i++){
            int a = bookings[i][0];
            int b = bookings[i][1];
            int k = bookings[i][2];
            arr[a]= arr[a]+ k;
            arr[b+1] = arr[b+1]-k;

        }
        for(int i=1;i<=n;i++){
            arr[i] = arr[i]+ arr[i-1];
        }
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]= arr[i+1];
        }
        return ans;
    }
}