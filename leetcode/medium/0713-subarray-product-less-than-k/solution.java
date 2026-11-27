class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        

          if (k <= 1) {
            return 0;
        }

        int n = nums.length;
        int count1 =0;
         int count2 =0;
         int count3 =0;
         int count4=0;
         int count5=0;
        int ans1 = 0;

          for(int i=0;i<n;i++){


            if((long)nums[i] * 1 < k){
                 count1++;
            }
          }
            for(int i=0;i<n-1;i++){
    
            if((long)nums[i] * nums[i+1] <k){
                count2++;
        
            }
             }
             for(int i=0;i<n-2;i++){
 
             if((long)nums[i] * nums[i+1]* nums[i+2] <k){
                count3++;
        
            } 
                }
                  for(int i=0;i<n-3;i++){
 
             if((long)nums[i] * nums[i+1]* nums[i+2]*nums[i+3] <k){
                count4++;
        
            } 
                }
                      for(int i=0;i<n-4;i++){
 
             if((long)nums[i] * nums[i+1]* nums[i+2]*nums[i+3]*nums[i+4] <k){
                count5++;
        
            } 
                }



          for (int i = 0; i < n; i++) {
    long product = 1;
    for (int j = i; j < n; j++) {
        product *= nums[j];
        if (j - i + 1 >= 6 && product < k) ans1++;
        else if (product >= k) break;
    }
}
                
              ans1 = count1+count2+count3+count4+count5+ans1;

            //   if(count < k){
            //     count4++;
            //   }
            
           return ans1;
   }
}