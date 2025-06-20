class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int left =0;
      int n = letters.length;
      int right = n-1;
      while(left<=right){
        int mid = (left+right)/2;

        if(letters[mid]<=target){
            left = mid+1;
        }
        else{
            right= mid-1; 
        }
      }

      return  left<n ? letters[left]: letters[0];
    }
}