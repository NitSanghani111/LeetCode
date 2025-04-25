class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int n= s.length();
        int res =0;
        int sign =1;
        int num =0;
        for(int i=0;i<n;i++){
             char c = s.charAt(i);
             if(Character.isDigit(c)){
                num = 10 * num + (int)(c-'0');

             }
             else if(c=='+'){
                res += sign*num;
                num =0;
                sign =1;
             }
             else if(c=='-'){
              res += sign*num;
              num =0;
              sign =-1;
             }
             else if(c=='('){
                st.push(res);
                st.push(sign);
                sign =1;
                res =0;
             }
             else if(c==')'){
              res += sign*num;
                num =0;
                res *=st.pop();
                res += st.pop(); 
             }
        }
        if(num !=0) res += sign*num;
        return res;
    }
}