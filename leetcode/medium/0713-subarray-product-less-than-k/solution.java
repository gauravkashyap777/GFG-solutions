class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        

        int n = nums.length;
        int count1 =0;
         int count2 =0;
         int count3 =0;
         int count4=0;
        int ans1 = 0;

          for(int i=0;i<n;i++){


            if(nums[i] * 1 < k){
                 count1++;
            }
          }
            for(int i=0;i<n-1;i++){
    
            if(nums[i] * nums[i+1] <k){
                count2++;
        
            }
             }
             for(int i=0;i<n-2;i++){
 
             if(nums[i] * nums[i+1]* nums[i+2] <k){
                count3++;
        
            }
                }

                  for(int i=0;i<n-3;i++){
 
             if(nums[i] * nums[i+1]* nums[i+2] * nums[i+3] <k){
                count4++;
        
            }
                }
              ans1 = count1+count2+count3+count4;
            
           return ans1;
   }
}