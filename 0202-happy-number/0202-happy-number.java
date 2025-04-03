class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> no = new HashSet<>();
       while(n!=1 && !no.contains(n)){
        no.add(n);
        n = sumofsqure(n);
       }
       return n==1;

    }
    private static int sumofsqure(int num){
        int sum=0;
        while(num>0){
        int dig = num%10;
        sum += dig*dig;
        num/=10;

        }
        return sum;
    }
  
}