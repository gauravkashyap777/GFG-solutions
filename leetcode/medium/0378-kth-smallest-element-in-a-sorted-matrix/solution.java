class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] arr = new int[n*m];
           int count =0;
           //int ans =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[count++] = matrix[i][j];
            }
        }
         Arrays.sort(arr);
               count =0;
               for(int i=0;i<arr.length;i++){
                count++;
                   if(count == k){
                    return arr[i];
                   }
               }
               
            
        
             return -1;

    }
}

 
               
          



    //    [1,5,9]
    //    [10,11,13]
    //    [12,13,15]         k = 8