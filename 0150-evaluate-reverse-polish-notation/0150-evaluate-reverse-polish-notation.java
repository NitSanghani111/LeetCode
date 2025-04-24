class Solution {

     long resolves(long a, long b, char op){
        if(op=='+') return a+b;
        else if(op=='-') return a-b;
        else if(op=='*') return a*b;
        return a/b;
    }

    public int evalRPN(String[] tokens) {
     Stack<Long> st = new Stack<>();
     int n = tokens.length;
     for(int i =0; i<n;i++){
        if(tokens[i].length()==1 && tokens[i].charAt(0)<48){
            long int2 = st.pop();
            long int1 = st.pop();
            char op = tokens[i].charAt(0);
            long resans = resolves(int1, int2 , op);
            st.push(resans); 
        }
        else{
            st.push(Long.parseLong(tokens[i]));
        }
     }
return st.pop().intValue();

    }
}