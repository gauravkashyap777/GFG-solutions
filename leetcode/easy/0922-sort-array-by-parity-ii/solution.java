class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        int[] element = new int[n];
        int even =0;
        int odd = 1;
        for(int i=0;i<n;i++){
            if(nums[i]%2 ==0){
             element[even] = nums[i];
             even+=2;
            }
    
            else{
                element[odd] = nums[i];
                odd+=2;
            }
        }
        return element;
    }
}


// atfirst i will traverse the array at first we find simiontaneously.
// one put even and another odd repeat again and again this process.