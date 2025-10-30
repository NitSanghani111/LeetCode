class Solution {
    public int sumOfUnique(int[] nums) {
        int sum =0;
    HashMap<Integer, Integer> hm= new HashMap<>();
   for(int num :nums){
    hm.put(num,hm.getOrDefault(num,0)+1);

   }
   for(int tmp : hm.keySet()){
    if(hm.get(tmp)==1){
        sum+=tmp;
    }
   }
   return sum;
 
    }
}