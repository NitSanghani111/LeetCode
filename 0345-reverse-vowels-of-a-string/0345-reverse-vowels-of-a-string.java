class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        boolean[] vow= new boolean[256];

         vow['a'] = vow['e'] = vow['i'] = vow['o'] = vow['u'] = true;
        vow['A'] = vow['E'] = vow['I'] = vow['O'] = vow['U'] = true;
        
        char [] a =s.toCharArray();

        while(start <  end){
            while(start < end && !vow[a[start]]){
                  start++;
            }
            while(start < end && !vow[a[end]]){
                end--;
            }
            char temp =  a[start];
            a[start]= a[end];
            a[end]=temp;
        start++;
        end--;

              
            
        }
return  new String(a);

    }
}