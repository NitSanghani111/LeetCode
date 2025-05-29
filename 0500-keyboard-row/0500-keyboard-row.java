class Solution {
    public String[] findWords(String[] words) {

      String  row1 = "qwertyuiop";
       String  row2 = "asdfghjkl";
       String row3 ="zxcvbnm";

       List<String> list = new ArrayList<>();
       for(String word :words){
        int [] arr = new int[3];
            for(char ch : word.toLowerCase().toCharArray()){
                if(row1.indexOf(ch)!=-1) 
                        arr[0] =1;
                else if(row2.indexOf(ch)!=-1)
                        arr[1]=1;
                else if(row3.indexOf(ch)!=-1)
                        arr[2]=1;
            }
            int count = arr[0]+ arr[1] + arr[2];
            if(count ==1){
                list.add(word);
            }
       }
        String [] finala = new String[list.size()];
        int i =0;
        for(String res : list){
            finala[i++] = res;

        }
        return finala;
    }
}