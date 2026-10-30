class Solution {
    public boolean containsDuplicate(int[] nums) {

       int n = nums.length;
         
        int i=0;
        int j = n-1;

        while(i<=j){

            if(nums[i] != nums[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}