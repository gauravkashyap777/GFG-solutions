class Solution {
    public int heightChecker(int[] heights) {
        
         //Arrays.sort(heights);
         int n = heights.length;    

         int [] expected = new int[n];
          int k=0;
          int count=0;
           for(int i=0;i<n;i++){
             expected[k++] = heights[i];
           }
                        Arrays.sort(expected);

             for(int i=0;i<n;i++){
                 if(heights[i]!= expected[i]){
                count++;
             }
             }
            
             
           
           
        
         return count;

    }
}