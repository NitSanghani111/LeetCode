class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char [] hexdig = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int dig = num &15;
            sb.append(hexdig[dig]);
            num >>>=4;

        }
        return sb.reverse().toString();

    }
}