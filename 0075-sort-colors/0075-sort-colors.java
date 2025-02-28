class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j= 0;j < n-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;   
                }
            }
        }


    }
}
    //method -2
    //  int mid =0;
    //  int low=0;
    //  int high = nums.length-1;
    //  while(mid <= high){
    //     if(nums[mid]==0){
    //         swap(nums, low, mid);
    //         low++;
    //         mid++;
    //     }
    //     else if(nums[mid]==1){
    //         mid++;
    //     }
    //     else{
    //         swap(nums, high, mid);
    //         high--;
    //     }
    //  }
    
    // }
    //  private  void swap(int []nums, int i, int j){
    //     int temp= nums[i];
    //     nums[i]=nums[j];
    //     nums[j]=  temp;
    //  }
