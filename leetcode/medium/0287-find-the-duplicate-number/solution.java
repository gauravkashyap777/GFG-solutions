class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
     //  ArrayList<Integer> ans = new ArrayList<>();
    // HashSet<Integer> ans = new HashSet<>();
        int n = nums.length-1;
       // int ans =0;
        for(int i=0;i<n;i++){
            if(nums[i] ==  nums[i+1]){
                return nums[i];
                
            }
        }
       return -1;
    }
}