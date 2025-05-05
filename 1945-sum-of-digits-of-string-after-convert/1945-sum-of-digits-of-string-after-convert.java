class Solution {
    public int getLucky(String s, int k) {
        String n ="";
        for(int i =0;i<s.length();i++){
            int val = s.charAt(i) - 'a' + 1;
            n+=val;

        }
        for(int i=0;i<k;i++){
            int sum =0;
            for(int j=0;j<n.length();j++){
                sum+=n.charAt(j) - '0';
            }
            n = String.valueOf(sum);
        }
        return Integer.parseInt(n);
    }
}