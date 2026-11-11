class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int count=0;
        int count1=0;
       // int hindex =0;

        for(int i=0;i<n;i++){
       
            if(citations[i] >= 3){
                count++;
             //hindex = citations[i];
            }
           
         }
         for(int i=0;i<n;i++){
            if(citations[i] >= 1){
                count1++;
            }
         }
        //return count,count1;
       // return count1;

       return  count;
    }
}