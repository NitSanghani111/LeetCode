class Solution {
    public String reverseWords(String s) {
        String[]word =s.split(" ");
        StringBuilder sb = new StringBuilder();
       for(String w:word){
        sb.append(new StringBuilder(w).reverse()).append(" ");
       }
              return sb.toString().trim();
    }
}