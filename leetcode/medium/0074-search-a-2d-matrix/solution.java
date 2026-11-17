class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(matrix[i][j] == target){
                    return true;
                }
                
            }
        }

         return false;
            
        //     int m = matrix.length;
        //     int n = matrix[0].length;

        //   int l =0;
        //   int r = m*n-1;

        //   while(l<=r){
        //     int mid = l+(r-l)/2;
        //       int mid_val = matrix[mid / n][mid % n];


        //     if(mid_val == target){
        //         return true;
        //     }else if(mid_val < target){
        //         l = mid+1;
        //     }else{
        //         r = mid-1;
        //     }
        //   }
        //   return false;

    }
}