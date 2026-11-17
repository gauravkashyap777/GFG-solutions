class Solution {
    public int findMin(int[] nums) {

    //  int min=Integer.MAX_VALUE;

    // for(int i=0;i<nums.length;i++){
    //     if(nums[i] < min){
    //         min = nums[i];
    //     }
    // }

    //        return min;


         int l = 0;
         int r = nums.length-1;

         if(nums[l] < nums[r] || nums.length==1){
            return nums[0];
         }
         int ans =-1;
         while(l<=r){
            int mid = l+(r-l)/2;

            if(nums[mid] >= nums[0]){
                l = mid+1;
            }else{
                ans = nums[mid];
                r = mid-1;
            }
         }
         return ans;
    }
}