class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder st = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== ')' ){
                count--;
            }
            if(count!=0){
                    st.append(s.charAt(i));
            }
            if(s.charAt(i)== '(' ){
                count++;
            }
        }
        return st.toString();
    }
}