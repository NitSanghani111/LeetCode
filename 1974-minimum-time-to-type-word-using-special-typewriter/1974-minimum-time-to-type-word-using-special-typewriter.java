class Solution {
    public int minTimeToType(String word) {
        int n = word.length();
        int counter = 0;
        char start ='a';
        for(int i=0; i<n;i++){
            char c =word.charAt(i);
            int diff = Math.abs(c-start);
            counter += Math.min(diff,26-diff)+1;

            start = c;

        }
        return counter;
    }
}