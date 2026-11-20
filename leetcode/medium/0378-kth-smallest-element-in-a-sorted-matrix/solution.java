class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
           int count =0;
           int ans =0;
        for(int i=0;i<n;i++){
            Arrays.sort(matrix[i]);
        }
            for(int j=0;j<m;j++){
                Arrays.sort(matrix[j]);

            }
             
             for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    count++;

                    if(count == k){
                        ans = matrix[i][j];
                    }
                }
             }

             return ans;
    }
}

 
               
          



    //    [1,5,9]
    //    [10,11,13]
    //    [12,13,15]         k = 8