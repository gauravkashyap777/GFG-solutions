class Solution {
    public int maximumGap(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int max =0;
         if (n < 2) {
                return 0;
            }
        for (int i = 0; i < n - 1; i++) {
            int diff = nums[i+1] - nums[i];
                    
        
            if(diff > max){
                max = diff;
            }
        }
           
        

        return max;

    }
}