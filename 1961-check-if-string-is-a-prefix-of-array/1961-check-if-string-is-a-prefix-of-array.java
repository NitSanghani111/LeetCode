class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String st: words){
            sb.append(st);
            if(sb.length() > s.length()){
                break;
            }
            if(sb.toString().equals(s)){
                return true;
            }
        }
    return false;
    }

}