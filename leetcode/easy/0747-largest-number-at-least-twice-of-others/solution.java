class Solution {
    public int dominantIndex(int[] nums) {
        
        int n = nums.length;
        int maxIndex=0;
          int max =0;
        for(int i=0;i<n;i++){
           if(nums[i] > max){
            max = nums[i];
            maxIndex =i;
        
           } 
        }
          for(int i=0;i<n;i++){
            if(i == maxIndex){
                continue;
            }
               if( nums[i] *2 > max ){
                return -1;
               }
          }


        
        
        return maxIndex;

    }
}