class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length==0 || s.length==0) return 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        while (i < s.length && count < g.length) {
            if (s[i] >= g[count]) {  
                count++;
            } 
            i++;
        }
        return count;
    }
}