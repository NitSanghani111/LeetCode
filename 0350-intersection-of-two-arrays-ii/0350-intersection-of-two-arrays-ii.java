class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int minlength = Math.min(nums1.length,nums2.length);
      int [] temp = new int[minlength];
      int idx =0;
      for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i] == nums2[j]){
                temp[idx++]=nums1[i];
                nums2[j]=Integer.MIN_VALUE;
                break;
            }
        }
      }
        int [] res = new int [idx];
        for(int i=0;i<idx;i++){
            res[i] = temp[i];
 
        }
 return res;
    }
}