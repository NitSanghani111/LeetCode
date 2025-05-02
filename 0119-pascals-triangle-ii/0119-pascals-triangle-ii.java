class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        long temp =1;
        for(int i=1,up =rowIndex,down =1;i<=rowIndex;i++,up--,down++){
            temp = temp*up/down;
            list.add((int)temp);
        }
        return list;
    }
}