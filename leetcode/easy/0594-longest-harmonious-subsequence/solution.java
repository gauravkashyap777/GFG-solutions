class Solution {
    public int findLHS(int[] nums) {
        
      int n = nums.length;
      int maxlength =0;

      for(int i=0;i<n;i++){
        int count1=0;
        int count2=0;

        for(int j=0;j<n;j++){
            if(nums[j] == nums[i]){
                count1++;
            }

            if(nums[j] == nums[i] +1){
                count2++;
            }
        }
            if(count1 > 0 && count2 > 0){
                int total = count1+count2;
                maxlength = Math.max(maxlength,total);
            }
        }
        return maxlength;
      
    }
}


// in the harmoniuious minm and maxm no of diffn is only 1
// return the llength of longest harmonius 