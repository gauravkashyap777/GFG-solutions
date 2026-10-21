class Solution {
    public List<Integer> getRow(int rowIndex) {
        
              rowIndex++;
       
        List<Integer> list = new ArrayList<>();
            list.add(1);
            long prev=1;

            for(int col=1;col<rowIndex;col++){
                long new_el= prev*(rowIndex-col);
                new_el/=col;
                list.add((int)new_el);
                prev=new_el;
            }
       return list;
    }
}